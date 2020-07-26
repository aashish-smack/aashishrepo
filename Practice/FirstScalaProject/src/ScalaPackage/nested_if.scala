package ScalaPackage

object nested_if {
  def main(args: Array[String]) {
    val a: Int = 10
    if (a > 5) {
      println("The number is greater than 5")
      if (a>15) {
        println("The number is Greater than 15")
      }  else {
        println("However the number is less than 15")
      }
    } else {
      println("The number is less than 10")
    } 
  }
}