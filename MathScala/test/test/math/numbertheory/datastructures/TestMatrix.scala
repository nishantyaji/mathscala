package test.math.numbertheory.datastructures

import math.numbertheory.datastructures.MatrixInt
import scala.collection.mutable.ArrayBuffer


object TestMatrix {
  def main(args: Array[String]): Unit = {
    
    var something = 4
    var str = something.toString()
    var fr = str.format("%9s")
    println(fr)
    val n = 2
    var elements = Array.ofDim[Int](n, n)
    for (i <- 0 until n)
      for (j <- 0 until n) {
        elements(i)(j) = i + j
        println(elements(i)(j))
      }
    elements = elements.drop(1)
    println("*")
    println(elements.size)
    for(i <- 0 until elements.size)
      println(elements(i).size)
    
    println("--------------")
    val m = new MatrixInt(2)
    m.put(0, 0, 0)
    m.put(0, 1, 1)
    m.put(1, 0, 2)
    m.put(1, 1, 3)
    
    println(m)
    println("--------------")
    m.removeRowAndCol(1)
    println(m)
    
    var r1 = Array(1,2,3)
    var r2 = Array.ofDim[Int](3)
    r1.copyToArray(r2, 0,1)
    for(i <- 0 until r2.length)
      println(r2(i))
  }
}