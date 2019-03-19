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
    try {
      //Check if window is greater than size of list or window is 0
      if (window > elementList.size || window == 0) {
        throw new Exception()
      }
      else {
        //return average of moving window
        elementList.takeRight(window).sum / window
      }
    }
    catch{
      //Throw exception and return -1
      case e: Exception => println("Size of window is greater than size of data structure or window is 0")
      return -1
    }
  }

  //gets element from specified location
  override def getElementAt(location: Int): Int =
  {
    try
    {
      if(elementList.isEmpty) //Check if data structure is empty and throw exception
      {
        throw new IndexOutOfBoundsException()
      }
      else
      {
        return elementList(location) //return element at location
      }
    }
    catch {
      //return exception and -1
      case e: IndexOutOfBoundsException => println("Index Out of Bounds: List is empty or try some other index")
        return -1
    }
  }

  //Add List of elements to data structure
  override def addList(elementInsert: List[Int]): Unit =
  {
    elementList ++= elementInsert
  }

  //Get access to all element in data structure
  override def getAllElement(): List[Int] = elementList.toList

}