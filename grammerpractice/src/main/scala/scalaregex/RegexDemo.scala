package scalaregex

object RegexDemo {
  def main(args: Array[String]): Unit = {
    val str="chen yan ning"
    val patten="chen".r
    println(patten findFirstIn str)

    val ps=(patten findAllIn str).mkString(",")
    println(ps)
  }

}
