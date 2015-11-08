package test.math.numbertheory.datastructures

import math.numbertheory.datastructures.NumberSurd
import lib.numbertheory.basic.lib.numbertheory.datatype.Surd.Functions

object TestNumberSurd {
  def main(args: Array[String]): Unit = {
    val a = new NumberSurd[Double](2, 3)
    val b = new NumberSurd[Double](3, 2)
    
    println(a.getValue())
    println(b.getValue())
    println(a > b)
    
    var aa = Array(1,2)
    var bb = Array(2, 3)
    aa = aa ++ bb
    aa.foreach(println)
    aa.foreach(println)
    
    println(Functions.multiplyConsecutiveInts(2, 5))
  }
}