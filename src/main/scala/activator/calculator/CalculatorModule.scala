package activator.calculator

import com.softwaremill.macwire._

trait CalculatorModule {
  lazy val randomModifier = wire[RandomModifier]
  lazy val interpretFavoriteColor = wire[InterpretFavoriteColor]
  lazy val calculateLuckyNumber = wire[CalculateLuckyNumber]

  /*
  Equivalent to (generated code):

  lazy val randomModifier = new RandomModifier()
  lazy val interpretFavoriteColor = new InterpretFavoriteColor()
  lazy val calculateLuckyNumber = new CalculateLuckyNumber(randomModifier, interpretFavoriteColor)
   */
}
