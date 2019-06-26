package money

class Dollar(private val ammount: Int) {
  def times(multiplier: Int) = new Dollar(ammount * multiplier)

  override def equals(obj: Any): Boolean = {
    val dollar: Dollar = obj.asInstanceOf[Dollar];
    return ammount == dollar.ammount;
  }
}
