import org.scalatest._

import money.Dollar

class MoneySpec extends FlatSpec with DiagrammedAssertions {
  it should "multiplication" in {
    val five = new Dollar(5)
    assert(new Dollar(10) == five.times(2))
    assert(new Dollar(15) == five.times(3))
  }

  it should "equality" in {
    assert(new Dollar(5).equals(new Dollar(5)))
    assert(!new Dollar(5).equals(new Dollar(6)))
  }
}
