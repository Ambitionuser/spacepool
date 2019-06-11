package scalacycle

object CycleDemo {
  def main(args: Array[String]): Unit = {
    for (i<- 1 to 10){
      println(i)
    }
    var j = 0
    while (j<10){
      j+=1
      println(j)
    }





  }

}
