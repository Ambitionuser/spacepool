package scaladate

import java.text.SimpleDateFormat

object DateDemo {
  def main(args: Array[String]): Unit = {
    //String -->Date
    val timeString_1 = "2019-06-11 23:14:01"
    val date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeString_1)
    println(date)
    //date-->long
    val time = date.getTime
    println(time)

    //covert long->date
    val longTime=1613839669
    val date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(longTime)
    println(date2)

    //long -->String
    println("currentMilliseconds: " + System.currentTimeMillis())
    val time_5: String = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis())
    println("time_5: " + time_5)



  }

}
