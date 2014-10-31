package src.main.scala

object HashHandler {

  def hash(value: String): String = {
    var hashValue = 0
    for (c <- value) {
      hashValue = (hashValue << 5) - hashValue + c
    }
    hashValue.toString
  }
}