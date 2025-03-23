import org.apache.spark.SparkContext
object ScalaSparkAssignment1P11 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = Array((101, "John"), (102, "Alice"), (103, "Bob"), (104, "David"))
    val rdd = sc.parallelize(data)
    val rdd1=rdd.lookup(103)
    println(rdd1)
  }

}
