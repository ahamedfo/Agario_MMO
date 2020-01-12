package testing_game
import org.scalatest._
import agar.{Online, Players, Positions, Games}

import scala.collection.mutable.ListBuffer

class TestWinner extends FunSuite {
  var User = new Positions(0,0,122)
  var Players2 = new Positions(3,1,0)
  var Players3 = new Positions(0,0,444)

  var Full_user = new Players(User,true,"Ahamed")
  var Full_Player2 = new Players(Players2,true,"Ahamed22")
  var Full_Player3 = new Players(Players3,true,"Ahamed33")

  var Online_players = new Online(ListBuffer(Full_Player2))
  test("Winner"){
    assert(Games.Winner(Online_players) == "Ahamed22")
  }
}
