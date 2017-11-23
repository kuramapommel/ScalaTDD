package com.github.kuramapommel.scalatdd.money

trait Expression {

  def reduce( to: String ): Money

}
