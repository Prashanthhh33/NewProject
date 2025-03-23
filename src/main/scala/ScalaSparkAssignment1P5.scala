import org.apache.spark.SparkContext
object ScalaSparkAssignment1P5 {
  def main(args: Array[String]):Unit = {
    val sc = new SparkContext("local[*]","RemoveDuplicates")
    val data = Array(1,2,3,3,4,5,5,6,7,7,8,9)
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.distinct()
    rdd1.collect().foreach(println)
  }

}
