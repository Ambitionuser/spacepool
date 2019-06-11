package scalautils

import scala.io.StdIn

object UtilsDemo {
  def main(args: Array[String]): Unit = {
    println("请输入：")
    val str = StdIn.readLine()
    println(str)
  }

}
