package com.turntabl.scala
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Locale
import java.text.SimpleDateFormat
import java.time
object Starter extends App {
  println(farenheit(20.3));
  println(convertDate("01/02/15"));
  formatPasswordFile()
  
}

def farenheit(c: Double) = (c * 9 /5) + 32;
def convertDate(date: String): String = {

  val outputFormat = new SimpleDateFormat("D MMM yyyy", Locale.US)
  val inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.US)

  val inputText = "2012-11-17T00:00:00.000-05:00"
  val date = inputFormat.parse(inputText)
  return outputFormat.format(date)
}

def formatPasswordFile(): Unit = {
  val pattern = ":".r
  val str = "root:x:0:0:root:/root:/bin/bash"
  println(pattern replaceAllIn (str, "\n"))
}