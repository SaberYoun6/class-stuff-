import scala.io.AnsiColor._
import java.util.Scanner
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
    val http = "http://allaboutscala"
    val ch = http.toCharArray()
    println(ch(8))

  }
  def main(args: Array[String]): Unit = {
    jsonLike()
    
    val sc = new Scanner(System.in)
    
    val  name = sc.nextLine()
    val  age  = sc.nextInt()

    nameAge(name,age)
    httpIndexer()
    



  }
}
