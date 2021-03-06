package com.coffemon.TeaDB.core

import java.io.File

import scala.io.Source

object Persister {

  def store(dto: DTO) {
    val file = new File(dto.path);
    val directory = new File(file.getParentFile().getAbsolutePath());
    directory.mkdirs();
    val pw = new java.io.PrintWriter(file)
    try pw.write(dto.value) finally pw.close()
  }

  def load(dto: DTO): String = {
    val myString = Source.fromFile(dto.path).mkString
    return myString;
  }

}