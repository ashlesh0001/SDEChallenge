package MovingAverage

import scala.collection.mutable.ListBuffer

class MovingAverageImplementation() extends MovingAverageTrait[Int]{
  //Mutable list to store elements
  var elementList = new ListBuffer[Int]()

  //add a element to data structure
  override def addElement(element: Int): Unit =
  {
    elementList += element
  }

  //get moving average of Last N elements
  override def movingAverage(window: Int): Int =
  {
    printf("")
    return 0
  }

  //gets element from location specified
  override def getElementAt(location: Int): Int =
  {
   println("")
   return 0
  }

}