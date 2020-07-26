package ScalaPackage

import scala.io.StdIn._ 

object read_from_console {
  def main(args:Array[String]):Unit={  
    
    println("Enter the number of iterations : ")
    var i: Int = readInt()
    
    while (i > 0) {

    println("Enter your Number1 : ")
    val num1 = readInt()
    println("Enter your Number2 : ")
    val num2 = readInt()
    println("Enter the operation you want to perform : sum/minus/product/division ")
    val oper = readLine()
    
    if(oper == "sum"){
      println(s"Sum of $num1 and $num2 : ${num1 + num2}")
    } else if(oper=="minus") {
      println(s"Substraction of $num1 and $num2 : ${num1 - num2}")
    } else if(oper=="product") {
      println(s"Product of $num1 and $num2 : ${num1 * num2}")
    } else if(oper=="division") {
      println(s"Division of $num1 and $num2 : ${num1 / num2}")
    } else {
      println(s"Please enter the correct operation.\n " +
               "It should be one of this list: sum/minus/product/division ")
    }
    
         i -= 1
         println(s"Iterations left : ${i}")
    }
  }
  
}