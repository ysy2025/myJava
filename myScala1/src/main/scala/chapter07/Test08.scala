package chapter07

import scala.collection.mutable

/**
 * 两个集合合并
 */
object Test08 {

  def main(args: Array[String]): Unit = {
    // 两个 Map 的数据合并
    val map1 = mutable.Map("a"->1, "b"->2, "c"->3)
    val map2 = mutable.Map("a"->4, "b"->5, "d"->6)

    println(map1 ++ map2)

    val map3 = map1.foldLeft(map2){
      (map, kv) =>{
        val k = kv._1
        val v = kv._2

        map(k) = map.getOrElse(k, 0) + v
        map
      }
    }
    
    println(map3)

  }
}
