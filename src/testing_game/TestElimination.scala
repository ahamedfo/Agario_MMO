package testing_game
import org.scalatest._
import agar.{Games, Online, Players, Positions}

import scala.collection.mutable.ListBuffer
import scala.math.{Pi, sqrt}

class TestElimination extends FunSuite {
  var User = new Positions(0,0,122)
  var Players2 = new Positions(3,1,0)
  var Players3 = new Positions(0,0,444)

  var Full_user = new Players(User,true,"Ahamed")
  var Full_Player2 = new Players(Players2,true,"Ahamed22")
  var Full_Player3 = new Players(Players3,true,"Ahamed33")

  var Online_players = new Online(ListBuffer(Full_Player2,Full_Player3,Full_user))
  test("TestElimination"){
    assert(Games.Elimination(Full_user,Online_players)== ListBuffer(Full_Player3))
  }

}