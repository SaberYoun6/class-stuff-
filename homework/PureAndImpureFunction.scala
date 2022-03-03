import scala.collection.immutable.TreeMap

object PureAndImpureFunction {

    def pureFunction(d1:Double,d2:Double,d3:Double): Double = {
      if (d1== d2 && d2 == d3 && d1 != d3  )
        d1*d2*d3
      else
        d1+d2+d3
    }
  def impureFunction(): Unit = {
    val r = scala.util.Random
    val coreName =  TreeMap[String, Int]("Arizona" -> 56,"Delaware" -> r.nextInt(55), "Massachusetts"->r.nextInt(55),"Washington D.C"->r.nextInt(55),"Washington State"->r.nextInt(55),
      "Virgina" ->r.nextInt(55),"New York" -> r.nextInt(55),"Connecticut" -> r.nextInt(55),"Ohio"-> r.nextInt(55),"Iowa"->r.nextInt(55),"Kansas"->r.nextInt(55),
    "Indiana" ->r.nextInt(55),"Maryland"-> r.nextInt(55),"Alaska"-> r.nextInt(55),"Hawaii"-> r.nextInt(55),"Alabama"->r.nextInt(55)," Arkansas"->r.nextInt(55)
    ,"California"->r.nextInt(55),"Colorado"->r.nextInt(55),"Florida"->r.nextInt(55),"Georgia"->r.nextInt(55),"Idaho"->r.nextInt(55),"Illinois"->r.nextInt(55)
      ,"Kentucky"->r.nextInt(55),"Louisiana"->r.nextInt(55),"Maine"->r.nextInt(55),"Michigan"->r.nextInt(55),"Minnesota"->r.nextInt(55)," Mississippi"->r.nextInt(55)
    ,"Missouri"->r.nextInt(55),"Montana"->r.nextInt(55),"Nebraska"->r.nextInt(55),"Nevada"->r.nextInt(55),"New Hampshire"->r.nextInt(55),"New Jersey"->r.nextInt(55),"New Mexico"->r.nextInt(55)
      ,"North Carolina"->r.nextInt(55) ,"North Dakota"->r.nextInt(55),"Oklahoma"->r.nextInt(55),"Oregon"->r.nextInt(55),"Pennsylvania"->r.nextInt(55),"Rhode Island"->r.nextInt(55),"South Carolina"->r.nextInt(55)
      ,"South Dakota"->r.nextInt(55) ,"Tennessee"->r.nextInt(55),"Texas"->r.nextInt(55),"Utah"->r.nextInt(55),"Vermont"->r.nextInt(55),"West Virginia"->r.nextInt(55),"Wisconsin"->r.nextInt(55)
      ,"Wyoming"->r.nextInt(55) ,"Puerto Rico"->r.nextInt(55),"Guam"->r.nextInt(55),"US Virgin Islands"->r.nextInt(55),"Northern Mariana Islands"->r.nextInt(55),"American Samoa"->r.nextInt(55))(implicitly[Ordering[String]].reverse)

    println(coreName)

  }
    def main(args: Array[String]) : Unit = {
      val d1 = 8.8
      val d2 = 8.8
      val d3 = 8.8
      val shouldntWork = pureFunction(d1,d2,d3)
      printf("%.1f%n",shouldntWork)
      impureFunction()
    }
}


