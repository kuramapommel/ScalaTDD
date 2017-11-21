package com.github.kuramapommel.scalatdd.test.money

import org.scalatest._

class MoneyTest extends FlatSpec with Matchers {

  import com.github.kuramapommel.scalatdd.money._

  "Dollar" should "multiplication" in {
    val five = Money.dollar( 5 )
    assert( Money.dollar( 10 ) == five.times( 2 ) )
    assert( Money.dollar( 15 ) == five.times( 3 ) )
  }

  "Money" should "equality" in {
    assert( Money.dollar( 5 ) == Money.dollar( 5 ) )
    assert( Money.dollar( 5 ) != Money.dollar( 6 ) )

    assert( Money.franc( 5 ) == Money.franc( 5 ) )
    assert( Money.franc( 5 ) != Money.franc( 6 ) )

    assert( Money.franc( 5 ) != Money.dollar( 5 ) )
  }

  "Franc" should "multiplication" in {
    val five = Money.franc( 5 )
    assert( Money.franc( 10 ) == five.times( 2 ) )
    assert( Money.franc( 15 ) == five.times( 3 ) )
  }
}
