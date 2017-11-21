package com.github.kuramapommel.scalatdd.money

final object Money {

  val dollar = Dollar( _ )

  val franc = Franc( _ )

}

sealed trait Money {

  val amount : Int

  def times( multiplier: Int ) : Money

}

final case class Dollar( amount: Int ) extends Money {

  override def times( multiplier: Int ) = Dollar( amount * multiplier )

}

final case class Franc( amount: Int ) extends Money {

  override def times( multiplier: Int ) = Franc( amount * multiplier )

}