package com.turntabl.scala
//import org.scalatest.funsuite.
import org.scalatest.flatspec.AnyFlatSpec
class TradeeTest extends AnyFlatSpec {

  it should "have a valid result " in {
      val tradee =  Tradee("23", "rer",  10.0);
      val result = tradee.value;
//      assert(result == 51.0)
      assertResult(50.0) { result }
  }

}
