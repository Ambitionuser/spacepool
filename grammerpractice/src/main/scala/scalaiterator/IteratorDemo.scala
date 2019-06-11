package scalaiterator

object IteratorDemo {
  def main(args: Array[String]): Unit = {
    val iterator = Iterator("chen","yan")
    while (iterator.hasNext){
      val str = iterator.next()
      println(str)
    }
  }

}
