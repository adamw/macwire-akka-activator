package activator.calculator

import java.util.Random

class RandomModifier {
  private val random = new Random()

  def next(): Int = random.nextInt() % 17
}
