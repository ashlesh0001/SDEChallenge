package MovingAverage

object Program extends App {
  val test = new MovingAverageImplementation()
  test.addElement(1)
  test.addElement(2)
  test.addElement(3)
  test.addElement(4)
  println(test.movingAverage(2))
}
