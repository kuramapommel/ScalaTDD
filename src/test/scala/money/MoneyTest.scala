package money

import org.scalatest._

class MoneyTest extends FlatSpec with Matchers {

  "Multiplication" should {
    val five = Doller( 5 )
    five.times( 2 )
    five.amount should be( 10 )
  }

}
