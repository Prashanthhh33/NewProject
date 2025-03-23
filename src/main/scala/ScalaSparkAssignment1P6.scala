import org.apache.spark.SparkContext
object ScalaSparkAssignment1P6 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List("Scala", "Spark", "Hadoop", "Hive", "Scala", "Spark")
    val rdd = sc.parallelize(data)
    val rdd1=rdd.count()
    println(rdd1)
  }

}
