//package View.gui
//
//import akka.actor.Actor
//import javafx.scene.input.KeyCode
//
//case object Update
//
//case object ClickGold
//
//case object Save
//
//case object Player_move
//
//case class BuyEquipment(equipmentID: String)
//
//class GameActor(username : String) extends Actor{
//
//  var game = new Agario_class(username)
//
//  override def receive: Receive = {
//    case Player_move =>
//      if(game.Agario.keyPressed(KeyCode) && game.Agario.keyPress(KeyCode)){
//
//      }
//    case Update =>
//    case Save =>
//    case ClickGold =>
//    case buy: BuyEquipment =>
//  }
//
//}
