package scalaclass

class ClassExtendsTrait extends TraitDemo {
  override def getsum(x: Int, y: Int) = {
    val z=x*y
    z
  }
}


case class CaseClass(x:Int,y:Int)
