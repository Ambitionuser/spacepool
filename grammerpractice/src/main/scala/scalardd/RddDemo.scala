package scalardd

object RddDemo {
  def main(args: Array[String]): Unit = {
    //模拟数据
    val rdd1=List(1,2,3,6,2)
    val rdd2=Array("u w","5 o","5 p")

    //map练习
    val value1 = rdd1.map(_*2)
    val value2=rdd1.map(x => x*2)
    println(value1)
    println(value2)

    //map,filter练习
    val value3 = rdd1.map(_*2).filter(_ > 3)
    val value4=rdd1.map(x=>x*2).filter(y=>y>4)
    println(value3)
    println(value4)




  }

}
