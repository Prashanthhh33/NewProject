import org.apache.spark.SparkContext
object ScalaSparkAssignment1P24 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = Array(500, 1000, 200, 50, 700, 900)
    val rdd1 = sc.parallelize(data)
    val max = rdd1.max()
    val min = rdd1.min()
    println(max)
    println(min)
  }
}
