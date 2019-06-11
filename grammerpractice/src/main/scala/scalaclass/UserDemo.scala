package scalaclass

object UserDemo {
  def main(args: Array[String]): Unit = {
    val user = new User
    user.id=3

    //用注解获取
    val id1 = user.getId
    println(id1)

    //用注解设置变量
    user.setId(9)
    println(user.id)
    println(user.getId)
    user.id=0
    println(user.id)
    println(user.getId)
    println("---------------------------------------------------")

    //无注解
    user.age=23
    val age1 = user.age
    println(age1)

  }

}
