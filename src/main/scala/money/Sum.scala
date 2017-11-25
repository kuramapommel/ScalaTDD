package com.github.kuramapommel.scalatdd.money

final case class Sum( augend: Expression, addend: Expression ) extends Expression {

  override val times = ( multiplier: Int ) => Sum( augend.times( multiplier ), addend.times( multiplier ) )

  override def +( addend: Expression ) = Sum( this, addend )

  override def reduce( bank: Bank, to: String ) = {
    val amount = augend.reduce( bank, to ).amount + addend.reduce( bank, to ).amount
    Money( amount, to )
  }

}
