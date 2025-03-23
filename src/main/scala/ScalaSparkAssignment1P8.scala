import org.apache.spark.SparkContext
object ScalaSparkAssignment1P8 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List("Big Data is powerful", "Spark makes processing faster")
    val rdd = sc.parallelize(data)
    val rdd1=rdd.flatMap(x => x.split(" "))
    rdd1.collect().foreach(println)

  }

}
