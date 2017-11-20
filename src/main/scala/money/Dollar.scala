package com.github.kuramapommel.ScalaTDD.money

class Dollar( var amount: Integer ) {

  amount = 5 * 2

  def times( multiplier: Integer ) = {}
}

object Dollar {
  def apply( amount: Integer ) = new Dollar( amount )
}
