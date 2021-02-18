import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import matchers.should._

class LowIntSumTest extends AnyFlatSpec with Matchers {

  val tests = List(
    (List(5, 8, 12, 18, 22),   13),
    (List(7, 15, 12, 18, 22),  19),
    (List(25, 42, 12, 18, 22), 30),
    (List(1, 8, 12, 18, 5),     6),
    (List(13, 12, 5, 61, 22),  17)
  )

  tests.foreach {
    case (input, expected) =>
      val result = LowIntSum.sumTwoSmallestUsingSorting(input)
      s"sumTwoSmallest($input)" should s"return $expected" in {
        result should be (expected)
      }
  }
}