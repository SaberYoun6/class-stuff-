import java.util
import scala.io.AnsiColor._
import java.util.Scanner
import scala.collection.immutable.{HashSet, ListMap, TreeMap}
import scala.util.matching.Regex

//Saberina Young 
//
//
//:
object HomeWork1SaberinaYoung{
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
    val http = "http://allaboutscala".charAt(8)
    println(http)
  }
  def fullName(movie:String) : Unit = {
    
    println("please include enter your given-name and surname ")
    val sc = new Scanner(System.in)
    val givenName= sc.next()
    val surName= sc.next()
    printf("First name: %s%nLast Name: %s%nFavorite Movie %s%n",givenName,surName,movie)
  }
  def favoriteMovie(movie:String): String = {
    movie
  }
  def donutCost():Unit= {
    var math = 2.50 * 10
    printf("$%.2f%n.",math)
  }
  def donutPrices(): Unit = {
    val donut = "Vanilla Donut 10 2.25"
    val pattern: Regex= "^[Va-z]+ [Da-z]+".r
    val  pattern2: Regex = "[0-9]+".r
    val  pattern3:  Regex = "[0-9].[0-9]+$".r

    val st =pattern.findAllIn(donut).mkString
    val inventory = pattern2.findFirstIn(donut).mkString.toInt
    val cost = pattern3.findFirstIn(donut).mkString.toDouble
    printf("Donut Name :%s%nInventory:  %d%nCost: $%.2f%n ", st, inventory, cost)
  }
  def childName(): Unit = {
     val coreName =  TreeMap[String, Int]("Bill" -> 9,"Jonny" -> 8, "Tommy"->11,"Cindy" -> 12 )(implicitly[Ordering[String]].reverse)

    println(coreName)

  }
  def baskets(): Unit ={
    val basket1 =HashSet("Cake","Milk", "Cheese", "Toilet Paper")
    val basket2 = HashSet("Bread","Water", "Juice", "Milk","Cheese")
    val basket3 = basket1.intersect(basket2)
    println(basket3)
  }

  def numberLiter(): Unit={
    var n = 100
    var i = 100
    do{
      println(i)
      i=i+1
    }while (i<=110)
  }



  def main(args: Array[String]): Unit = {
    jsonLike()
    val kyd = new Scanner(System.in)
    val sc = new Scanner(System.in)
    println("please enter your first name")
    val  name = sc.nextLine()
    println("please enter your age")
    val  age  = sc.nextInt()

    nameAge(name,age)

    httpIndexer()

    donutCost()

    println("Please enter your favorite movie Title")
    val movie = kyd.nextLine()

    val title =favoriteMovie(movie)

    println(title)

    
    fullName(movie)
    donutPrices()

    childName()

    baskets()
    numberLiter()

    sc.close()

  }
}
