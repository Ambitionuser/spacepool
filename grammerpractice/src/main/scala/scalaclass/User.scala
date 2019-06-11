package scalaclass

import java.util.Date
import scala.beans.BeanProperty

class User {
  //测试无注解
  var age:Int= _


  @BeanProperty
  var id: Long = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var birthday: Date = _

  @BeanProperty
  var telephone: String = _

}
