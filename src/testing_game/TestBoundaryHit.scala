package testing_game
import org.scalatest._
import agar.{Games,Online, Players, Positions, World,Boundary}

import scala.collection.mutable.ListBuffer

class TestBoundaryHit extends FunSuite {
  var User = new Positions(0,0,0)
  var Players2 = new Positions(3,1,1000)
  var Players3 = new Positions(0,0,0)

  var Full_user = new Players(User,true,"Ahamed")
  var Full_Player2 = new Players(Players2,true,"Ahamed22")
  var Full_Player3 = new Players(Players3,true,"Ahamed33")

  var bound1 =  new Positions(100000,100000,0)
  var bound2 = new Positions(1,1,0)

  var boundary = new Boundary(bound1)
  var boundary2 = new Boundary(bound2)

  test("testme"){
    assert(Games.Boundary_hit(Full_user,boundary) == false)
    assert(Games.Boundary_hit(Full_Player2,boundary2) == true)
  }


}
