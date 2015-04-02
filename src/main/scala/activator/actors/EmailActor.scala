package activator.actors

import akka.actor.Actor

class EmailActor extends Actor {
  override def receive = {
    case email: String => println(s"""I would send an email: "$email", if I were real, but I'm not.""")
  }
}

trait Email
