import org.apache.spark.SparkContext
object ScalaSparkAssignment1P22 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = Array(55, 20, 75, 10, 90, 5, 30)
    val rdd1 = sc.parallelize(data)
    val rdd2 = rdd1.takeOrdered(5)
    rdd2.foreach(println)
  }
}
