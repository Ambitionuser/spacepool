package scalacollection

import scala.reflect.internal.util.HashSet

object CollectionDemo extends App {
  override def main(args: Array[String]): Unit = {
    //list
    val list=List(1,2,7,4)
    //set
    val set=Set(2,6,1,9)
    //map
    val map=Map("one"->1,"two"->2)
    //元祖(固定长度，不同类型)
    val tuple1=Tuple3(1,2,4)

  }

}
