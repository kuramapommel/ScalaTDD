package com.github.kuramapommel.scalatdd.money

final case class Sum( augend: Expression, addend: Expression ) extends Expression {

  override def +( addend: Expression ) = null

  override def reduce( bank: Bank, to: String ) = {
    val amount = augend.reduce( bank, to ).amount + addend.reduce( bank, to ).amount
    Money( amount, to )
  }

}
