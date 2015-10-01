package test.math.numbertheory.datastructures

import math.numbertheory.datastructures.NumberSurd

object TestNumberSurd {
  def main(args: Array[String]): Unit = {
    val a = new NumberSurd[Double](2, 3)
    val b = new NumberSurd[Double](3, 2)
    
    println(a.getValue())
    println(b.getValue())
    println(a > b)
  }
}