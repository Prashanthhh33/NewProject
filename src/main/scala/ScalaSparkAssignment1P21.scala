import org.apache.spark.SparkContext
object ScalaSparkAssignment1P21 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List(("New York", 3), ("London", 2), ("New York", 5), ("Paris", 1))
    val rdd1 = sc.parallelize(data)
    val rdd2 = rdd1.countByKey()
    rdd2.foreach(println)
  }
}
