package com.github.kuramapommel.scalatdd.money

trait Money {

  protected val amount : Integer

}

final case class Dollar( amount: Integer ) extends Money {

  def times( multiplier: Integer ) = Dollar( amount * multiplier )

}
