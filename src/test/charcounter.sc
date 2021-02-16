import scala.io.StdIn.readLine

object CharCounterExercise extends App{
  //TODO ask user to enter a sentence
  //TODO calculate and save character frequency into a Map
  //you can use mutable and/or immutable Map
  //print out this map with character frequencies
  //so your Map most likely will be of type [Char,Int]
  //also i think getOrElseUpdate method will be helpful
  val sentence = readLine("Introduce your sentence, please")
  val mutMap = new scala.collection.mutable.HashMap[Char,Int]
  for (i <- sentence) {
    if (mutMap.contains(i))
      mutMap(i)= (mutMap(i) + 1)
    else
      mutMap.+=((i, 1))
  }
  def mapString(s: String): Map[Char, Int] = {
    s.groupBy(c => c).map{case(c,str) => c-> str.size}.toMap
  }
  mapString(sentence)
  val result = sentence.groupMapReduce(identity)(_ => 1)(_ + _)
  println(result)
}
