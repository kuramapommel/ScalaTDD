package com.github.kuramapommel.ScalaTDD.money

class Dollar( var amount: Integer ) {

  def times( multiplier: Integer ) = Dollar( amount * multiplier )
}

object Dollar {
  def apply( amount: Integer ) = new Dollar( amount )
}
