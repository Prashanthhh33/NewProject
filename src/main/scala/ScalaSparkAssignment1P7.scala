import org.apache.spark.SparkContext
object ScalaSparkAssignment1P7 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List("hello","world","scala", "spark")
    val rdd = sc.parallelize(data)
    val rdd1=rdd.map(x => x.toUpperCase)
    rdd1.collect().foreach(println)
  }

}
