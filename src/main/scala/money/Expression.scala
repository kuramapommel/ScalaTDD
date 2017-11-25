package com.github.kuramapommel.scalatdd.money

trait Expression {

  val times: Int => Expression

  def +( addend: Expression ): Expression

  def reduce( bank: Bank, to: String ): Money

}
