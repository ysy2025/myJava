package chapter02

import java.io.{FileWriter, PrintWriter}

import scala.io.Source

/**
 * 从文件中读取
 * 涉及scala的io库
 * Source.fromFile()方法
 *
 * 也可以写入文件
 * scala没有专门的写入的方法;java有;需要调用java的io类
 */
object Test06 {

  def main(args: Array[String]): Unit = {
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // 通过java的io来写入
    val writer = new PrintWriter("src/main/resources/test.txt")
    writer.write("zhangsanlisiwangermazi")
    writer.close()

//    val writer1 = new FileWriter("src/main/resources/test.txt", true)
//    writer1.write("hahaha")
//    writer1.close()
  }

}
