

package com.coffemon.TeaDB.core
object ObjectStore {

  def put(key: String, value: Any) = {
    val dto = new DTO(key, value);
    Persister.store(dto);

  }

  def get[T](key: String, resType: Class[T]): T = {
    val dto = new DTO(key);
    val json = Persister.load(dto);
    return JsonTransformer.deserialize(json, resType);

  }

}