package src.main.scala
import java.io.File

object Persister {

  def store(dto: DTO) {
    val file = new File(dto.path);
    val directory = new File(file.getParentFile().getAbsolutePath());
    directory.mkdirs();
    val pw = new java.io.PrintWriter(file)
    try pw.write(dto.value) finally pw.close()
  }

}