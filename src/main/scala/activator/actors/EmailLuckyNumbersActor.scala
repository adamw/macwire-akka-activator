package activator.actors

import akka.actor.{ActorRef, Actor}
import com.softwaremill.macwire._

class EmailLuckyNumbersActor(
  calculateActor: ActorRef @@ Calculate,
  emailActor: ActorRef @@ Email) extends Actor {

  override def receive = {
    case request: CalculateRequest =>
      calculateActor ! request
    case result: Int =>
      emailActor ! s"The lucky number is $result"
  }
}
