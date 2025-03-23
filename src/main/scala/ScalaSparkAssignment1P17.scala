import org.apache.spark.SparkContext
object ScalaSparkAssignment1P17 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data1 = List(1, 2, 3, 4)
    val data2 = List(3, 4, 5, 6)
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val set_union=rdd1.union(rdd2)
    set_union.collect().foreach(println)
  }

}
