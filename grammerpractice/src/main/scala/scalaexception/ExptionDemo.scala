package scalaexception

import java.io.{FileNotFoundException, FileReader}


object ExptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val fileReader = new FileReader("inpu.txt")
    } catch {
      case ex:FileNotFoundException =>{
        println("ceshi")
      }
    }


  }

}
