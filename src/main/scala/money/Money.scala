package com.github.kuramapommel.scalatdd.money

final object Money {

  val dollar = ( amount: Int ) => new Dollar( amount, "USD" )

  val franc = ( amount: Int ) => new Franc( amount, "CHF" )

}

sealed class Money( val amount: Int, val currency: String ) {

  def times( multiplier: Int ): Money = null

  override def equals( obj: Any ) = obj match {
    case money: Money => amount == money.amount && currency == money.currency
    case _ => false
  }

}

final class Dollar( amount: Int, currency: String ) extends Money( amount, currency ) {

  override def times( multiplier: Int ) = new Dollar( amount * multiplier, currency )

}

final class Franc( amount: Int, currency: String ) extends Money( amount, currency ) {

  override def times( multiplier: Int ) = new Franc( amount * multiplier, currency )

}