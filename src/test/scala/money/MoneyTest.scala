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

    assert( franc( 5 ) != dollar( 5 ) )
  }

  "Money" should "have currency" in {
    assert( "USD" == Money.dollar( 1 ).currency )
    assert( "CHF" == Money.franc( 1 ).currency )
  }

  "Money" should "have simple addition" in {
    val five = Money.dollar( 5 )
    val sum = five + five
    val bank = new Bank
    val reduced = bank.reduce( sum, "USD" )

    assert( Money.dollar( 10 ) == reduced )
  }

  "Plus" should "return sum" in {
    val five = Money.dollar( 5 )
    val result = five + five
    val sum = result.asInstanceOf[ Sum ]

    assert( sum.augend == five )
    assert( sum.addend == five )
  }

  "Sum" should "reduce" in {
    val sum = Sum( Money.dollar( 3 ), Money.dollar( 4 ) )
    val bank = new Bank
    val result = bank.reduce( sum, "USD" )

    assert( result == Money.dollar( 7 ) )
  }

  "Money" should "reduce" in {
    val bank = new Bank
    val result = bank.reduce( Money.dollar( 1 ), "USD" )

    assert( result == Money.dollar( 1 ) )
  }

  "Different currency" should "reduce money" in {
    val bank = new Bank
    bank.addRate( "CHF", "USD", 2 )
    val result = bank.reduce( Money.franc( 2 ), "USD" )

    assert( result == Money.dollar( 1 ) )
  }

  "Rate" should "have identity" in {
    assert( ( new Bank ).rate( "USD", "USD" ) == 1 )
  }

  "Different currency" should "have mixed addition" in {
    val fiveBucks = Money.dollar( 5 )
    val tenFrancs = Money.franc( 10 )
    val bank = new Bank
    bank.addRate( "CHF", "USD", 2 )
    val result = bank.reduce( fiveBucks + tenFrancs, "USD" )

    assert( result == Money.dollar( 10 ) )
  }
}
