package mypackage

import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.stage.Stage

import mypackage.ScalaFxExtensions.expressionBlockToEventHandler

object MyStage extends Stage {
  val myButton = new Button
  myButton.onAction = { scene = new Scene }
}