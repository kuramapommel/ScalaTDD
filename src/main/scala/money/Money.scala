package com.github.kuramapommel.scalatdd.money

final object Money {

  val dollar = ( amount: Int ) => Dollar( amount, "USD" )

  val franc = ( amount: Int ) => Franc( amount, "CHF" )

}

sealed abstract class Money( amount: Int, currency: String ) {

  def times( multiplier: Int ) : Money

}

final case class Dollar( amount: Int, currency: String ) extends Money( amount, currency ) {

  override def times( multiplier: Int ) = Money.dollar( amount * multiplier )

}

final case class Franc( amount: Int, currency: String ) extends Money( amount, currency ) {

  override def times( multiplier: Int ) = Money.franc( amount * multiplier )

}