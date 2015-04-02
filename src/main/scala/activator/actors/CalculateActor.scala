package activator.actors

import activator.calculator.CalculateLuckyNumber
import akka.actor.Actor

class CalculateActor(calculateLuckyNumber: CalculateLuckyNumber) extends Actor {

  def receive = {
    case CalculateRequest(a, fc) =>
      sender() ! calculateLuckyNumber.calculate(a, fc)
  }
}

trait Calculate
