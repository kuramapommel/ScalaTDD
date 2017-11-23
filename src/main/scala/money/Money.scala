package com.github.kuramapommel.scalatdd.money

final object Money {

  val dollar = ( amount: Int ) => Money( amount, "USD" )

  val franc = ( amount: Int ) => Money( amount, "CHF" )

}

final case class Money( amount: Int, currency: String ) extends Expression {

  val times = ( multiplier: Int ) => Money( amount * multiplier, currency )

  def +( money: Money ) = Sum( this, money )

  override def reduce( bank: Bank, to: String ) = {
    val rate = bank.rate( currency, to )
    Money( amount / rate, to )
  }

}