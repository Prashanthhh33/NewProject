import org.apache.spark.SparkContext
object ScalaSparkAssignment1P26 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List("analytics", "data", "spark", "databricks", "database")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.filter(x=>x.contains("data")).count()
    println(rdd1)

  }
}
