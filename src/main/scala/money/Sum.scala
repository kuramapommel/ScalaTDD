package com.github.kuramapommel.scalatdd.money

final case class Sum( augend: Money, addend: Money ) extends Expression {

  override def reduce( bank: Bank, to: String ) = {
    val amount = augend.amount + addend.amount
    Money( amount, to )
  }

}
