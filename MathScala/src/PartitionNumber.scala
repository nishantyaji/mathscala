import scala.collection.mutable.HashMap

object PartitionNumber {
  private val map = HashMap("1_1" -> 1)
  
  def main(args: Array[String]): Unit = {
    println(partition(1000))
  }
  
  def partition(n: Int): Int = partition(n, n)
  def partition_MaxPart_K(n: Int, max : Int) = partition(n, max)
  def partition_KParts(n: Int, max : Int) = partition_MaxPart_K(n, max)
  def partition_withoutAnyPartAsOne(n: Int) = partition(n) - partition(n-1)
  def partition_withAtleastOnePartAsOne(n: Int) = partition(n-1)
  
  private def partition(n: Int, max: Int): Int = {
    assert(n >= max)
    if (max == 0 || max == 1) return 1
    val key = translate(n, max)

    if (map.contains(key))
      map(key)
    else {
      var sum = 0;
      for (i <- 1 to max)
        sum += partition(n - i, if (i > n - i) n - i else i)
      map += (key -> sum)
      sum
    }
  }

  private def translate(n: Int, m: Int) = n.toString() + "_" + m.toString()
}