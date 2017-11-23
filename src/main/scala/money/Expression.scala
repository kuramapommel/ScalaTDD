package com.github.kuramapommel.scalatdd.money

trait Expression {

  def reduce( bank: Bank, to: String ): Money

}
