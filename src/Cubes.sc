import scala.io.StdIn.readLine

object CubeTable extends App {
  //TODO write a program that takes user input for starting and end values
  //then saves cubes of those values in a Seq data type and then prints the cubes out
  var begVal = readLine("What is the starting value?").toDouble
  println(s"Will print cubes starting with cube for $begVal")
  var endVal = readLine("what is the end value?").toDouble
  println(s" the end value is $endVal ")
  var beg = Math.pow(begVal, 3).toInt
  var end = Math.pow(endVal, 3).toInt
  val result = IndexedSeq(beg,end)
  println(result)
}
