package com.github.kuramapommel.ScalaTDD.test.money

import org.scalatest._

class MoneyTest extends FlatSpec with Matchers {

  import com.github.kuramapommel.ScalaTDD.money._

  "Dollar" should "multiplication" in {
    val five = Dollar( 5 )
    five.times( 2 )
    five.amount should be( 10 )
  }

}
