package com.github.kuramapommel.ScalaTDD.test.money

import org.scalatest._

class MoneyTest extends FlatSpec with Matchers {

  import com.github.kuramapommel.ScalaTDD.money._

  "Dollar" should "multiplication" in {
    val five = Dollar( 5 )
    assert( Dollar( 10 ) == five.times( 2 ) )
    assert( Dollar( 15 ) == five.times( 3 ) )
  }

  "Dollar" should "equality" in {
    assert( Dollar( 5 ) == Dollar( 5 ) )
    assert( Dollar( 5 ) != Dollar( 6 ) )
  }
}
