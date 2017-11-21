package com.github.kuramapommel.scalatdd.money

sealed trait Money {

  protected val amount : Integer

}

final case class Dollar( amount: Integer ) extends Money {

  def times( multiplier: Integer ) = Dollar( amount * multiplier )

}

final case class Franc( amount: Integer ) extends Money {

  def times( multiplier: Integer ) = Franc( amount * multiplier )

}