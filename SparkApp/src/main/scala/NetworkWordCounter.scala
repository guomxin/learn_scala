import org.apache.spark._
import org.apache.spark.streaming._

object NetworkWordCounter {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("NetworkWordCounter");
    val ssc = new StreamingContext(conf, Seconds(10))
    val lines = ssc.socketTextStream(args(0), 9999)
    val words = lines.flatMap(_.split(" "))
    val pairs = words.map(w => (w, 1))
    val wordCounts = pairs.reduceByKey(_ + _)
    wordCounts.print()
    ssc.start()
    ssc.awaitTermination()
  }
}