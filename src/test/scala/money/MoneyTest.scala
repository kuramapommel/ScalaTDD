package com.github.kuramapommel.scalatdd.test.money

import org.scalatest._

class MoneyTest extends FlatSpec with Matchers {

  import com.github.kuramapommel.scalatdd.money._

  "Dollar" should "multiplication" in {
    val money = Money.dollar
    val five = money( 5 )

    assert( money( 10 ) == five.times( 2 ) )
    assert( money( 15 ) == five.times( 3 ) )
  }

  "Money" should "equality" in {
    val dollar = Money.dollar
    val franc = Money.franc

    assert( dollar( 5 ) == dollar( 5 ) )
    assert( dollar( 5 ) != dollar( 6 ) )

    assert( franc( 5 ) == franc( 5 ) )
    assert( franc( 5 ) != franc( 6 ) )

    assert( franc( 5 ) != dollar( 5 ) )
  }

  "Franc" should "multiplication" in {
    val money = Money.franc
    val five = money( 5 )

    assert( money( 10 ) == five.times( 2 ) )
    assert( money( 15 ) == five.times( 3 ) )
  }
}
