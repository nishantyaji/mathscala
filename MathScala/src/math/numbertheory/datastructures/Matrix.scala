package math.numbertheory.datastructures

class MatrixInt(n : Int) {
	private var elements = Array.ofDim[Int](n, n)

			def put(rowNum: Int, colNum: Int, value: Int):Unit = 
			elements(rowNum)(colNum) = value

			def removeRowAndCol(rowAndColNum: Int): Unit =
		{
		val f1 = (a: Array[Int], n: Int) => a.view.take(n) ++ a.view.drop(n+1)
				val f2 = (a: Array[Array[Int]], n: Int) => a.view.take(n) ++ a.view.drop(n+1)
				/*
				elements = f2(this.elements, rowAndColNum)
				elements = elements.foreach( _ = f1(_, rowAndColNum))
				 */
		}

	override def toString(): String = 
		{
			var str = "["
					elements.foreach(x => {
						str+= "\n\t["
								x.foreach(y => str += "%9s" format y )
								str+= "%9s" format "]"
					}
							);
			str += "\n]" 
					str
		}


}

class MatrixList[T] {
	//private var list = new ArrayList[ArrayList[T]]();
}