package com.turntabl.scala

import java.io.File
import scala.util.Random

object Main extends App {
//  val trade = new Tradee("233", "aapl", 23, 25.5);
//  println(trade)
//  trade.price = -10.2
//  println(trade)
 var l = (new File(".")).listFiles
// l.map(println)
//  l.map(a => (a.getName, a.length())).map(_(0)).tapEach(println)
  l.sortWith((a,b) => a.length() > b.length()).tapEach(println)
  println("==================================================================")
  l.sortWith((a,b) => a.length() > b.length()).take(2).tapEach(println)
//  l.filter(s => !s.isHidden).tapEach(println)
//ld.map(println)
//val tradeSingleton = Tradee("32", "aapl",   34.0)
////val c = new Tradee("32", "aapl", 5, 34.0)
//  println(tradeSingleton)
//
//  val a = Random.nextInt(10)
//
//  println(a match {
//    case 1 => s"This is number ${1}"
//    case 2 => s"This is number ${2}"
//    case _ => "This is nothing important"
//  })
}
