# 反推 ESClient的设计思路

## EsClient类
变量:
log
jestClient 作为es的客户端
    任何使用过Elasticsearch的人都知道，使用基于rest的搜索API构建查询可能是单调乏味且容易出错的。
    Jest，一个用于Elasticsearch的HTTP Java客户端。
    Elasticsearch提供了自己原生的Java客户端，然而 Jest提供了更流畅的API和更容易使用的接口

方法:
createClient 自然是创建客户端
indicesExists index是否存在
search 搜索 这里返回值是SearchResult 而 searchresult是jestresult的子类
scroll 搜索 返回值是JestResult
    当一个搜索请求返回单页结果时，可以使用 scroll API 检索体积大量（甚至全部）结果，
    这和在传统数据库中使用游标的方式非常相似。
    不要把 scroll 用于实时请求，它主要用于大数据量的场景。
clearScroll
    当超出了 scroll timeout 时，搜索上下文会被自动删除。
    但是，保持 scrolls 打开是有成本的，当不再使用 scroll 时应当使用 clear-scroll API 进行显式清除。
execute 类似scroll,返回值是JestResult

getStatus 获取状态
isBulkResult 是否是整块的结果 bulk操作和以往的普通请求格式有区别
```commandline
https://blog.csdn.net/Little_fxc/article/details/112549559
```

alias 别名
closeJestClient 关闭客户端

这么一分析,就有种庖丁解牛的feel了.

## ESField类
变量
name alias value child

然后是一堆getter setter
稍微复杂的一个getFinalName,大体上是把name处理一下

ESReader
一个内部静态类 Job
几个规定方法
prepare
准备一下参数什么的
init 调用父类
split 这个是切分configuration,切分配置
post
destory

一个内部静态类 Task
几个override方法
prepare 创建客户端
init 设置参数
startRead
    首先search
    然后transport
    scroll
    各种try-catch避免错误
    其他方法也都是见名知意,是crud的常规操作
    重点是一个transportRecords,传送records
    buildRecord,构建记录
    getColumn,获取column信息等

## Key类
    一堆getter 和isxxx的判断类