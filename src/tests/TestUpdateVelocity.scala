//package tests
//import org.scalatest.FunSuite
//
//class TestUpdateVelocity extends FunSuite{
//  import physics._
//  test("updating velocity"){
//  var velocit: PhysicsVector= new PhysicsVector(1.0,9.0,0.0)
//  var veloci: PhysicsVector = new PhysicsVector(4.0,6.0,96.0)
//  var v1: PhysicalObject = new PhysicalObject(velocit,veloci)
//
//  var velocity3: PhysicsVector = new PhysicsVector(1.0,7.0,0.0)
//  var velocity4: PhysicsVector = new PhysicsVector(1.0,2.0,-83.0)
//  var v2:PhysicalObject = new PhysicalObject(velocity3,velocity4)
//
//    var velocity5: PhysicsVector = new PhysicsVector(1.0,7.0,0.0)
//    var velocity6: PhysicsVector = new PhysicsVector(1.0,2.0,89)
//    var v3:PhysicalObject = new PhysicalObject(velocity5,velocity6)
//
//  var worlds = new World(10.0)
//    var worlds6 = new World(19.0)
//
//  Physics.updateVelocity(v1,worlds, 8.0)
//  Physics.updateVelocity(v2,worlds, 5.0)
//    Physics.updateVelocity(v3,worlds6, 0.0)
//
//  assert(v1.velocity.z == 16.0)
//  assert(v2.velocity.z == 0.0)
//    assert(v3.velocity.z == 89.0)
//}
//}
