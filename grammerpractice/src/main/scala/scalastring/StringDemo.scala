package scalastring

object StringDemo {
  def main(args: Array[String]): Unit = {
    //String 不可变
    var buf="hello ni hao"
    var length = buf.length
    println(length)

    //
    val sb = new StringBuilder
    sb.append("123")
    sb +='p'
    sb ++="fasdka"
    println(sb)

    val str = "asfasa".concat("dasda")
    println(str)
  }

}
