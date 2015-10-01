package math.numbertheory.datastructures

import math.numbertheory.traits.ValueAble

class NumberSurd[T <: AnyVal](a: T, b: T) extends OrderedPair(a, b) with Ordered[NumberSurd[T]] with ValueAble {
  def equals(that: NumberSurd[T]) = this.getValue() == that.getValue

  def compare(that: NumberSurd[T]): Int =
    {
      if (this.getValue() > that.getValue())
        0
      else if (this.getValue() > that.getValue())
        1
      else
        -1
    }

  def getValue(): Double = Math.pow(a.asInstanceOf[Double], b.asInstanceOf[Double])

}