package com.github.kuramapommel.scalatdd.money

final object Money {

  val dollar = ( amount: Int ) => Money( amount, "USD" )

  val franc = ( amount: Int ) => Money( amount, "CHF" )

}

final case class Money( amount: Int, currency: String ) extends Expression {

  val times = ( multiplier: Int ) => Money( amount * multiplier, currency )

  def +( money: Money ) = Sum( this, money )

  override def reduce( to: String ) = {
    val rate = if ( currency == "CHF" && to == "USD" ) 2 else 1
    Money( amount / rate, to )
  }

}