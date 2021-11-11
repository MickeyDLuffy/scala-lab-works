package com.turntabl.scala

import scala.util.Random

case class Tradee private(val ID: String,
             val symbol: String,
             quantity: Int,
             private var _price: Double) {

  def price_=(price: Double): Unit = {
     if(price >= 0) {
       this._price = price;
     }
  }


  def price = this._price
  val value = quantity * price
  val lamfda = (s: String) => s.toString
  val f = (s: String, f: (String => String)) => f(s)
  println(f("name", a => a.toUpperCase()))

/**
 * CASE =====> pattern match staements in scala
 * */

val a = Random.nextInt(10)

  val d = a match {
    case 1 => s"This is number ${1}"
    case 2 => s"This is number ${2}"
    case _ => s"This is nothing important ${a}"
  }

  println(d)


}

object Tradee {
  def apply(id: String, symbol: String, price: Double) = {
      if(price < 0) {
        throw new Exception("You cannot add negative quantity")
      }
      new Tradee(id, symbol, 1, price)
  }

  val dance = () => "Dancing agbadza here"
}

