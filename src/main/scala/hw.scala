
import src.main.scala.DTO
import main.java.A
import src.main.scala.Persister

object B {

  def main(args: Array[String]) {
    val a = new A()
    a.print()
    val dto=new DTO("sda","value");
    Persister.store(dto);
  }
}