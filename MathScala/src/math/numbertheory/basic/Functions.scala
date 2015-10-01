package lib.numbertheory.basic
package lib.numbertheory.datatype.Surd


import scala.collection.immutable.IndexedSeq
import math.numbertheory.basic.PrimalityAndFactorization
import math.numbertheory.datastructures.OrderedPair

object Functions {
  
  def eulersTotientFunction(n: Int): Int = multipliableOverPrimeFactors(n, n, f => (f.first - 1)/f.first )
  
  def numDivisors(n: Int): Int = multipliableOverPrimeFactors(n, 1, f => f.second + 1)
  
  def factorial(n: Int): Int = if(n == 1 ) 1 else n*factorial(n-1)
  
  def quadraticEquationRoot(a: Int, b: Int, c: Int): OrderedPair[Double] =
  {
    val x = -b/(2*a)
    val y = StrictMath.sqrt(b*b-4*a*c)/(2*a)
    new OrderedPair[Double](x-y, x+y)
  }
  
  def multiplyConsecutiveInts(lower: Int, higher: Int):Int =  
  {
    var result = 1
    for(i <- lower to higher) 
      result *= i
    result
  }  
  
  def nPr(n: Int, r: Int): Int = if(n > r) multiplyConsecutiveInts(n-r+1, n) else 1
  
  def nCr(n: Int, r: Int): Int = if(n > r) multiplyConsecutiveInts(n-r+1, n)/multiplyConsecutiveInts(1, r) else 1
  
  def multipliableOverPrimeFactors(n: Int, init: Int, f: OrderedPair[Int] => Int): Int =
  {
    val lst = PrimalityAndFactorization.primeFactorization(n)
    var result = init
    lst.foreach( x => result*f(x) )
    result
  }  
  
  def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a%b)
  
  def lcm(a: Int, b: Int): Int = a.abs*b.abs/gcd(a,b)
  
  def relativelyPrimeAndLesserThanN(n: Int):List[Int] =
		  (for( i <- 1 to n; if(gcd(i, n) == 1 )) yield i).toList
	    
}