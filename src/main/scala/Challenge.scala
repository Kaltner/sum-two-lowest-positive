object LowIntSum extends App {

  def sumTwoSmallestUsingSorting(numbers: List[Int]): Int = {
    numbers.sorted.take(2).sum
  }
}