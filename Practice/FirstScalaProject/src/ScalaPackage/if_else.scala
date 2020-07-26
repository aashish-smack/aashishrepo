package ScalaPackage

object if_else {
  def main(args: Array[String]){
    val a: Int = 10
    if(a>=18) { println(s"The person is eligible to vote. His age is $a")
    }
    else { println(s"Person is ineligible because he is younger than 18. His age is $a")
    }
  }
}