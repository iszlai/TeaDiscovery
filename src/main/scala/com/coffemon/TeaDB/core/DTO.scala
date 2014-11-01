
package com.coffemon.TeaDB.core

class DTO(val key: String,inValue: Any) {
  
  def this(key:String)=this(key,"");
  val BASE="TeaDB";
  val fileName: String = HashHandler.hash(key);
  val topFolder = fileName.charAt(0);
  val subFolder = fileName.charAt(1);
  val path = getFullPath();
  val value=JsonTransformer.serialize(inValue);

  def getPath(): String = {
    var pathList = List(BASE,topFolder, subFolder);
    return pathList.foldRight("")( _+"/"+ _);
  }
  
  def getFullPath():String={
    return getPath+fileName;
  }
}