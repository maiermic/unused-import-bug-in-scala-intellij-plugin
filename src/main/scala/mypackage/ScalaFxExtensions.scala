package mypackage

import javafx.event.{Event, EventHandler}

object ScalaFxExtensions {
  implicit def expressionBlockToEventHandler[T <: Event, R](block: => R): EventHandler[T] =
    new EventHandler[T] {
      def handle(event: T) {
        block
      }
    }
}
