package ScalaPackage

object Arithmetic {
  def main(args: Array[String]){
    // Addition
    val x = ("This is the addition of 2 numbers %d, %d  ")
    val y = 2
    val z = 5
    val r = x.format(y,z)
    println(r)
    val sum = y + z
    val sub = z - y
    val prd = y * z
    val div = z / y
    val rem = z ^ y
    println(s"Sum of $y + $z = $sum")
    println(s"Substraction of $z - $y = $sub")
    println(s"product of $y * $z = $prd")
    println(s"Division of $z / $y = $div")
    println(s"Remainder of $z % $y = $rem")
    
  }
}