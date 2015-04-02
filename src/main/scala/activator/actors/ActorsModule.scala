package activator.actors

import activator.calculator.CalculateLuckyNumber
import akka.actor.{ActorRef, Props, ActorSystem}
import com.softwaremill.macwire._

trait ActorsModule {

  def createEmailActor() = actorSystem.actorOf(Props(wire[EmailActor])).taggedWith[Email]
  def createCalculateActor() = actorSystem.actorOf(Props(wire[CalculateActor])).taggedWith[Calculate]

  def createEmailLuckyNumbersActor(ca: ActorRef @@ Calculate, ea: ActorRef @@ Email) =
    actorSystem.actorOf(Props(wire[EmailLuckyNumbersActor]))

  def calculateLuckyNumber: CalculateLuckyNumber
  def actorSystem: ActorSystem
}
