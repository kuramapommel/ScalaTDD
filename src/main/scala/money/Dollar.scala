package com.github.kuramapommel.ScalaTDD.money

final case class Dollar( amount: Integer ) {

  def times( multiplier: Integer ) = Dollar( amount * multiplier )

  override def equals( obj: Any ) = {
    obj.asInstanceOf[Dollar].amount == amount
  }

}
