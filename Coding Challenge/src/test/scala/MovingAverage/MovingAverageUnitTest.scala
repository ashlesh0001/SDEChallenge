package MovingAverage

import org.scalatest.FunSuite

class MovingAverageUnitTest extends FunSuite {
  test("Test Case 1") {
    val testList = new MovingAverageImplementation
    testList.addList(List(7,8,9,10))
    assert(testList.getMovingAverage(3) === 9)
  }
  test("Test Case 2") {
    val testList = new MovingAverageImplementation
    testList.addList(List(7,8,9,10))
    testList.addElement(1)
    testList.addElement(2)
    testList.addElement(3)
    testList.addElement(4)
    assert(testList.getMovingAverage(3) === 3)
  }
  test("Test Case 3")
  {
    val testList = new MovingAverageImplementation
    testList.addList(List(7,8,9,10))
    assert(testList.getElementAt(3) === 10)
  }
  test("Test Case 4")
  {
    val testList = new MovingAverageImplementation
    testList.addList(List(7,8,9,10))
    assert(testList.getAllElement() === List(7,8,9,10))
  }
}
