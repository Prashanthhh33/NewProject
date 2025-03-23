import org.apache.spark.SparkContext
object ScalaSparkAssignment1P14 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = Array((105, "Eve"), (101, "Alice"), (103, "Bob"), (104, "David"))
    val rdd = sc.parallelize(data)
    val rdd1=rdd.sortByKey()
    rdd1.collect().foreach(println)
  }

}
