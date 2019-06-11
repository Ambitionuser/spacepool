package scalamatch

/**
  * 模式匹配
  */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    val str = matchTest(3)
    println(str)
  }

  def matchTest(x:Int):String= x match {
    case 1=>"1"
    case 2=>"2"
    case _=>"many"
  }



}
