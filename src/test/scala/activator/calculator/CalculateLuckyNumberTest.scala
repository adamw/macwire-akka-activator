package activator.calculator

import org.scalatest.{ShouldMatchers, FlatSpec}

class CalculateLuckyNumberTest extends FlatSpec with ShouldMatchers with CalculatorModule {
  it should "calculate a lucky number" in {
    // given
    val modules = new CalculatorModule {
      override lazy val randomModifier = new RandomModifier {
        override def next() = 10
      }
    }

    // when
    val result = modules.calculateLuckyNumber.calculate(15, "red")

    // then
    result should be (15+3+10)
  }
}
