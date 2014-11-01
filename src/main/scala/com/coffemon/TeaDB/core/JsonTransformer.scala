
package com.coffemon.TeaDB.core

import java.io.StringWriter

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

object JsonTransformer {

  def serialize(value: Any): String = {
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)
    val out = new StringWriter
    mapper.writeValue(out, value)
    return out.toString()
  }

  def deserialize[T](json: String, valueType: Class[T]): T = {
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)
    return mapper.readValue(json, valueType);

  }

}