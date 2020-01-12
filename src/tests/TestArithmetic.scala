//package tests
//
//import org.scalatest.FunSuite
//import expressions.Expressions
//import expressions.Expressions.evaluateArithmetic
//
//class TestArithmetic extends FunSuite{
//  test("detect Collisions"){
//    val pow = (a: Double, b: Double) => Math.pow(a, b)
//    val mul = (a: Double, b: Double) => a * b
//    val div = (a: Double, b: Double) => a / b
//    val add = (a: Double, b: Double) => a + b
//    val sub = (a: Double, b: Double) => a - b
//    val operatorTable: Map[String, (Double, Double) => Double] = Map(
//      "^" -> pow,
//      "*" -> mul,
//      "/" -> div,
//      "+" -> add,
//      "-" -> sub
//    )
//    val order = List(List("^"), List("*", "/"), List("+", "-"))
//    //    println(evaluate("((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1))", (s: String) => s.toDouble, operatorTable, order))
//    assert(evaluateArithmetic("5^2+3") == 28.0 )
//    assert(evaluateArithmetic("((15 / (7 - (1 + 1))) * 3) - (2 + (1 + 1))") == 5.0 )
//    assert(evaluateArithmetic("6^2") == 36.0 )
//    assert(evaluateArithmetic("12-      11 + 5") == 6.0 )
//    assert(evaluateArithmetic("6") ==  6)
//    assert(evaluateArithmetic("6^2 + 5^2 - 3") ==  58.0)
//    assert(evaluateArithmetic(" 8^2 * (1 + 1)") ==  128)
//    assert(evaluateArithmetic("(3.5) + (3.5)") ==  7)
//  }
//}
