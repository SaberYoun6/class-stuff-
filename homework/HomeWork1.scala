import scala.io.AnsiColor._
import java.util.Scanner
import scala.util.matching.Regex

//Saberina Young 
//
//
//:
object HomeWork1{
  def jsonLike(): Any ={
    println(
"""{
  "donut_name":"Vanilla Donut",
  "quantity_purchase/" : "10",
  "price":2.5
}""")
  }
  def nameAge(name:String,age:Int): Unit ={
     println(s"${RESET}${BOLD}${UNDERLINED}$name${RESET} , ${RESET}${BOLD}$age${RESET}")
  }
  def httpIndexer(): Unit = {
    val http = "http://allaboutscala".substring(8,9)
    println(http)
  }
  def fullNameAndFavoriteMovie(wholeName:String, movie:String) : Unit = 
  {
    val name : Regex = "[A-Z]*[a-z]".r
    for (patternMatch <- name.findAllMatchIn(wholeName)) 
      printf("%s%n%s%n",patternMatch.group(1),patternMatch.group(2))
    println(movie)
  }
  def main(args: Array[String]): Unit = {
    jsonLike()
    
    val sc = new Scanner(System.in)
    val kyd = new Scanner(System.in)
    println("please enter your first name")
    val  name = sc.nextLine()
    println("please enter your age")
    val  age  = sc.nextInt()

    nameAge(name,age)
    httpIndexer()
    println("please include enter your surname and family-name ")
   
    val surnameAndFamilyname= "Saberina Young"

    var number = 7
    println("What is your favorite Movie!")
    val title = "Akria"


    
    fullNameAndFavoriteMovie(surnameAndFamilyname,title)


    kyd.close()
    sc.close()


  }
}
