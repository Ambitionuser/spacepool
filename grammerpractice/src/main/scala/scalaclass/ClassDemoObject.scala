package scalaclass

object ClassDemoObject {
  def main(args: Array[String]): Unit = {
    val extendsTrait = new ClassExtendsTrait
    val i = extendsTrait.getsum(3,5)
    println(i)


    val i1 = extendsTrait.getadd(3,5)
    println(i1)


    val clazz = new CaseClass(3,4)
  }

}
