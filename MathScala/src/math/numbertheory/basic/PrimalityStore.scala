package math.numbertheory.basic

import java.io._

//Not making this as a class or generic
object PrimalityStore{
  private val fileNameStore = "./Primes.txt"
  def main(args: Array[String]): Unit = {
    var array = initArray(100)
    array.foreach(println)
  }
  
  def storeIfNotPresent(maxLimit: Int) : Unit =
  {
    val writer = new PrintWriter(new File( fileNameStore ))
    var list = initList(maxLimit)
  }
    
  def initList(maxLimit: Int): List[Int] = return initArray(maxLimit).toList
  
  def initArray(maxLimit: Int): Array[Int] = 
  {
     var list = (2 to maxLimit).toList
     /*
     for(i <-  0 to (list.size-1) )
       if(list(i) <= Math.sqrt(maxLimit).intValue() )
         for(j <- i+1 to list.size-1)
           if(list(j) % list(i) == 0)
             list.drop(j)
             * 
             */
     /*
     for(i <- (0 to maxLimit-1); if(list(i) <= Math.sqrt(maxLimit).intValue()); j <- i+1 to list.size-1; if(list(j)%list(i) == 0))
       list.drop(j)
       * */
     return new Array[Int](0)
  }
    
  
}