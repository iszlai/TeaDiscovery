package src.main.scala
import src.main.scala.HashHandler.hash

class DTO(val key: String, val value: String) {
  val BASE="TeaDB";
  val fileName: String = HashHandler.hash(key);
  val topFolder = fileName.charAt(0);
  val subFolder = fileName.charAt(1);
  val path = getFullPath();

  def getPath(): String = {
    var pathList = List(BASE,topFolder, subFolder);
    return pathList.foldRight("")( _+"/"+ _);
  }
  
  def getFullPath():String={
    return getPath+fileName;
  }


}