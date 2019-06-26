import org.scalatest._

import money.Dollar

class MoneySpec extends FlatSpec with DiagrammedAssertions {
  it should "multiplication" in {
    val five = new Dollar(5)
    var product = five.times(2)
    assert(five.ammount == 5)
    assert(product.ammount == 10)
    product = five.times(3)
    assert(product.ammount == 15)
  }

  it should "equality" in {
    assert(new Dollar(5).equals(new Dollar(5)))
    assert(!new Dollar(5).equals(new Dollar(6)))
  }
}
