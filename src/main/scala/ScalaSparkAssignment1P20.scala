import org.apache.spark.SparkContext
object ScalaSparkAssignment1P20 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data1 = List(1, 2, 3)
    val data2 = List("A", "B")
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val set_cartesian=rdd1.cartesian(rdd2)
    set_cartesian.collect().foreach(println)
  }

}
