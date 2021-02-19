import scala.collection.mutable.PriorityQueue
import scala.math.Ordering
object LowIntSum extends App {

  def sumTwoSmallestUsingSorting(numbers: List[Int]): Int = {
    numbers.sorted.take(2).sum
  }

  def sumTwoSmallestUsingMinPriorityQueue(numbers: List[Int]): Int = {
    val queue = new PriorityQueue[Int]()(Ordering[Int].reverse)
    queue.++=(numbers).dequeueAll.take(2).sum
  }
}