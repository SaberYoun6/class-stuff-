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
  def fullName(movie:String) : Unit = 
  {
    val sc = new Scanner(System.in)
    val wholeName= sc.nextLine().stripMargin
    val name : Regex = "[A-Z]*[a-z]".r
    for (patternMatch <- name.findAllMatchIn(wholeName)) 
      printf("%s%n%s%n",patternMatch.group(0),patternMatch.group(1))
      println(movie)
  sc.close()
  }
  def FavoriteMovie(): String ={
    val sc = new Scanner(System.in)
    movie = sc.nextLine()
    sc.close()
  }
  def main(args: Array[String]): Unit = {
    jsonLike()
    
    val sc = new Scanner(System.in)
    println("please enter your first name")
    val  name = sc.nextLine()
    println("please enter your age")
    val  age  = sc.nextInt()

    nameAge(name,age)
    httpIndexer()
    println("What is your favorite Movie!")

    val title = favoriteMovie()
    println(title)
    println("please include enter your given-name and surname ")
    println("your favorite Movie title has already been include")
    
    fullName(title)


    sc.close()

  }
}
