import org.apache.spark.SparkContext
object ScalaSparkAssignment1P23 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List("Spark", "Scala", "Hadoop", "Kafka")
    val rdd1 = sc.parallelize(data)
    rdd1.foreach(println)
  }
}
