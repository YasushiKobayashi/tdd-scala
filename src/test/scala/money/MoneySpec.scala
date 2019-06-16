import org.scalatest._

import money.Doller

class MoneySpec extends FlatSpec with DiagrammedAssertions {
  it should "" in {
    val five = new Doller(5)
    five.times(2)
    assert(10 === five.ammount)
  }
}
