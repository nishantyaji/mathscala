package math.numbertheory.datastructures

class OrderedPair[T <: AnyVal](a: T, b: T) {
  val first = a
  val second = b
  override def toString(): String = "( " + first + ", " + second +  ")"
}