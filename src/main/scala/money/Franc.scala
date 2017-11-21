package com.github.kuramapommel.scalatdd.money

final case class Franc( amount: Integer ) {

  def times( multiplier: Integer ) = Franc( amount * multiplier )

}

