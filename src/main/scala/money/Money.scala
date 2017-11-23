package com.github.kuramapommel.scalatdd.money

final object Money {

  val dollar = ( amount: Int ) => Money( amount, "USD" )

  val franc = ( amount: Int ) => Money( amount, "CHF" )

}

final case class Money( amount: Int, currency: String ) extends Expression {

  val times = ( multiplier: Int ) => Money( amount * multiplier, currency )

  def +( money: Money ): Expression = Sum( this, money )

}