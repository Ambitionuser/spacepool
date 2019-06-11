package scalafun

object FunDemo {
  def main(args: Array[String]): Unit = {
    val i = add(3,8)
    println(i)

    val i1 = fun(7,9)
    println(i1)

    val i2 = fun1(3)
    println(i2)

  }


  //方法
  def add(a:Int,b:Int):Int={
    val i = a + b
    i
  }

  //函数
  val fun=(x:Int,y:Int)=>{
    x*y
  }
  //闭包(局部变量的另外一个函数)
  var tmp=3
  val fun1=(x:Int)=>x*tmp



}
