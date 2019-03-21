package MovingAverage

trait MovingAverageTrait[Any]{
  //getElement from data structure
  def getElementAt(location: Int): Int
  //addElement to data structure
  def addElement(element:Int)
  //Find moving average of N elements
  def getMovingAverage(movingWindow:Int): Int
  //Add List of elements to data structure
  def addList(elementList: List[Int])
  //Get all elements in data structure
  def getAllElement() : List[Int]
}


