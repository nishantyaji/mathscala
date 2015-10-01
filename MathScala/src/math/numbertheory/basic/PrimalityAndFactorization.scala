package math.numbertheory.basic

import math.numbertheory.datastructures.OrderedPair
import scala.collection.immutable.List
import scala.collection.mutable.MutableList
import math.numbertheory.datastructures.OrderedPair
import lib.numbertheory.basic.lib.numbertheory.datatype.Surd.Functions

object PrimalityAndFactorization {
  def main(args: Array[String]): Unit = {
    println("*" + Functions.relativelyPrimeAndLesserThanN(145365))
    println("**" + Functions.eulersTotientFunction(15))
    println("***" + Functions.numDivisors(15))
    println("***" + Functions.nCr(15, 4))
  }

  def isPrime(num: Long): Boolean =
  {
    for(i <- 2 to Math.sqrt((num.toDouble)).toInt)
      if(num % i == 0)
        return(false)
    if(num == 1) false else true
  }
  
  def highestPowerDividingN(base: Int, N: Int): Int =  if(N%base == 0) 1+highestPowerDividingN(base, N/base) else 0 
  
  def primeFactorization(n: Int) =
  {
    var loopvar = n
    def changeLoopVar(div: Int): Unit = loopvar = loopvar/div
    var v = new MutableList[OrderedPair[Int]]
    
    for{i <- 2 to n 
      if(loopvar > 1)
      if(n%i == 0)
      if(isPrime(i)) }
    {
      loopvar /= (StrictMath.pow(i, highestPowerDividingN(i, loopvar))).toInt
      v += (new OrderedPair(i, 1))
    }
    v.toList
  } 
      
}