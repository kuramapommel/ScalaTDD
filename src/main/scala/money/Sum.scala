package com.github.kuramapommel.scalatdd.money

final case class Sum( augend: Money, addend: Money ) extends Expression {

  override def reduce( to: String ) = {
    val amount = augend.amount + addend.amount
    Money( amount, to )
  }

}
