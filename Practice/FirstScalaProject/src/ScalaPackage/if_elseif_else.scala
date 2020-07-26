package ScalaPackage

object if_elseif_else {
  def main(args: Array[String]){
    val a = 9
    if (a%2 == 0) {
      println("divisible by 2")
    } else if (a%3 == 0) {
      println("divisible by 3")
    } else if (a%5 == 0) {
      println("divisible by 5")
    } else {
      println("divisible by none")
    }
  }
}