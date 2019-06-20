import org.scalatest._

import money.Dollar

class MoneySpec extends FlatSpec with DiagrammedAssertions {
  it should "multiplication" in {
    val five = new Dollar(5)
    var product = five.times(2)
    assert(10 === product.ammount)
    product = five.times(3)
    assert(15 === product.ammount)
  }

  it should "equality" in {
    assert(new Dollar(5).equals(new Dollar(5)))
    assert(!new Dollar(5).equals(new Dollar(6)))
  }
}
