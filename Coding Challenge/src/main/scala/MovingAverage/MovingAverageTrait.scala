package MovingAverage

trait MovingAverageTrait[Any]{
  //getElement from data structure
  def getElementAt(location: Int): Int
  //addElement to data structure
  def addElement(element:Int)
  //Find moving average of N elements
  def movingAverage(movingWindow:Int): Int
}


