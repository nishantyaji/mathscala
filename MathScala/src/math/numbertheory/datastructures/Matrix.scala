package math.numbertheory.datastructures

import scala.collection.mutable.MutableList

class Matrix[T](n: Int, defaultValue : T){
  
  /* usage
  def main(args: Array[String]): Unit = {
    var m = new Matrix[Int](4, 0)
    m.init()
    for(i <- 0 to 3)
      for(j <- 0 to 3)
        m.put(i, j, 4*i + j)
    println(m)
  }
  */
  
	private var elements = MutableList[MutableList[T]]()

	def init(): Unit = 
	{
		  elements = MutableList[MutableList[T]]()
				for(i <- 1 to n)
				{
					var tempList = MutableList[T]()
					for(j <- 1 to n) {tempList += defaultValue}
				  elements += tempList
				}

	}

	def put(rowNum: Int, colNum: Int, value: T): Unit = elements(rowNum)(colNum) = value

			def removeRowAndCol(rowAndColNum: Int): Unit =
		{
		var tempelements = MutableList[MutableList[T]]()
				for(row <- elements)
					tempelements += row.drop(rowAndColNum - 1) ++ row.dropRight(row.size - rowAndColNum)
					elements = tempelements
		}

	override def toString(): String =
		{
			var str = "["
			            elements.foreach(x => {
			            	str += "\n\t["
			            			x.foreach(y => str += "%9s" format y)
			            			str += "%9s" format "]"
			            });
			str += "\n]"
					str
		}

}

class MatrixList[T] {
	//private var list = new ArrayList[ArrayList[T]]();
}