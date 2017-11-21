package com.github.kuramapommel.scalatdd.money

final case class Dollar( amount: Integer ) {

  def times( multiplier: Integer ) = Dollar( amount * multiplier )

}
