package activator

import activator.actors.{CalculateRequest, ActorsModule}
import activator.calculator.CalculatorModule
import akka.actor.ActorSystem

import scala.io.StdIn

object LuckyNumberDemo extends App with CalculatorModule with ActorsModule {
  lazy val actorSystem = ActorSystem()

  lazy val ea = createEmailActor()
  lazy val ca = createCalculateActor()
  lazy val emailLuckyNumbersActor = createEmailLuckyNumbersActor(ca, ea)

  val age = 42
  val color = "red"

  emailLuckyNumbersActor ! CalculateRequest(age, color)

  // Should be more than enough for the actors to communicate
  Thread.sleep(1000L)
  println("Check your email!")
  actorSystem.shutdown()
}
