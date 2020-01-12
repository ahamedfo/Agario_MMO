//package tests
//
//import org.scalatest._
//import physics.{PhysicalObject, Physics, PhysicsVector}

//class TestGetSounds extends FunSuite {
//  test("GetSounds"){
//    val test: String = "data/cmudict-0.7b"
//    val word: String = "AFFILIATED"
//    val word2: String = "af"
//    val word3: String = " "
//    val word4: String = "234"
//    val list: List[String] = List("AH0", "F", "IH1", "L", "IY0", "EY2", "T", "IH0", "D")
//    val list2: List[String] = List()
//    val list3: List[String] = List()
//    val list4: List[String] = List()
//
//    assert(RhymingDictionary.getSounds(test,word) == list, word)
//    assert(RhymingDictionary.getSounds(test,word2) == list2, word2)
//    assert(RhymingDictionary.getSounds(test,word3) == list3, word3)
//    assert(RhymingDictionary.getSounds(test,word4) == list4, word4)
//    //    getSounds(test, word)
//  }
//}
//
//class TestComputeLocation extends FunSuite {
//  var LocationVector = new PhysicsVector(1,1,1)
//
//  var velocity = new PhysicsVector(2,5,7)
//  var velocity1 = new PhysicsVector(5,6,4)
//  var velocity2 = new PhysicsVector(9,1,-12)
//
//  var Object1 = new PhysicalObject(LocationVector,velocity)
//  var Object2 = new PhysicalObject(LocationVector,velocity1)
//  var Object3 = new PhysicalObject(LocationVector,velocity2)
//
//  var answers = new PhysicsVector(3,3,1)
//  test("ComputeLocation"){
//    assert(Physics.computePotentialLocation(Object1,2).x == 5.0)
//    assert(Physics.computePotentialLocation(Object1,2).y == 11.0)
//    assert(Physics.computePotentialLocation(Object1,2).z == 15.0)
//
//    assert(Physics.computePotentialLocation(Object2,2).x == 11.0)
//    assert(Physics.computePotentialLocation(Object2,2).y == 13.0)
//    assert(Physics.computePotentialLocation(Object2,2).z == 9.0)
//
//    assert(Physics.computePotentialLocation(Object3,1).x == 10.0)
////    assert(Physics.computePotentialLocation(Object3,1).y == 2.0)
////    assert(Physics.computePotentialLocation(Object3,1).z == 0)
////  }
////
//}