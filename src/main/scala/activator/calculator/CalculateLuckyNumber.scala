package activator.calculator

class CalculateLuckyNumber(randomModifier: RandomModifier, interpretFavoriteColor: InterpretFavoriteColor) {
  def calculate(age: Int, favoriteColor: String) = {
    val ageComponent = age % 23
    val colorComponent = interpretFavoriteColor.forColor(favoriteColor)
    val randomComponent = randomModifier.next()

    println(ageComponent)
    println(colorComponent)
    println(randomComponent)

    ageComponent + colorComponent + randomComponent
  }
}
