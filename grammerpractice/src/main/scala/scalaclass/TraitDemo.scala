package scalaclass

/**
  * 可以有方法体和没有方法体
  */
trait TraitDemo {
  def getsum(x:Int,y:Int):Int


  def getadd(x:Int,y:Int):Int={
    var z=x+y
    z
  }

}
