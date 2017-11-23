package com.github.kuramapommel.scalatdd.money

class Bank {

  def reduce( source: Expression, to: String ) = source.reduce( to )

  def addRate( from: String, to: String, rate: Int ): Unit = {}
}
