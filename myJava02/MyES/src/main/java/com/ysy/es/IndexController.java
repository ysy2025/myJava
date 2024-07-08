package com.ysy.es;

import org.elasticsearch.action.admin.indices.get.GetIndexRequest;
import org.elasticsearch.action.admin.indices.get.GetIndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;

public class IndexController {
    public static void main(String[] args) throws Exception {

        // client
        RestHighLevelClient client = Client.buildClient();


        // 创建搜索请求
        SearchRequest searchRequest = new SearchRequest("liuyan_threads_full_check_org"); // 将your_index_name替换为你的索引名
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery()); // 使用matchAllQuery来查询所有文档，你可以根据需要修改查询条件
        searchRequest.source(searchSourceBuilder);

        // 执行搜索
        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);

        // 处理响应
        for (SearchHit hit : searchResponse.getHits().getHits()) {
            String sourceAsString = hit.getSourceAsString();
            System.out.println(sourceAsString); // 打印每个文档的内容
        }

    }
}
