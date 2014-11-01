

import scala.beans.BeanProperty


class TestDataBean {

  @BeanProperty
  var name: String = _

  @BeanProperty
  var lastName: String = _

  def this(name: String, lastName: String) {
    this()
    this.name = name
    this.lastName = lastName
  }

  override def toString(): String = {
    "TestMyLib [name=" + name + ", lastName=" + lastName + 
      "]"
  }
}