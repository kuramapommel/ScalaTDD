package com.github.kuramapommel.scalatdd.money

import scala.collection.mutable.HashMap

class Bank {

  private[ this ] var rates = new HashMap[ Pair, Int ]

  val rate = ( from: String, to: String ) => if ( from == to ) 1 else rates.get( Pair( from, to ) ).get

  def reduce( source: Expression, to: String ) = source.reduce( this, to )

  def addRate( from: String, to: String, rate: Int ) = rates += ( Pair( from, to ) -> rate )
}
