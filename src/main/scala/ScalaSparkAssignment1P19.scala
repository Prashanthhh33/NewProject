import org.apache.spark.SparkContext
object ScalaSparkAssignment1P19 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data1 = List(10, 20, 30, 40, 50)
    val data2 = List(30, 40, 50)
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val set_substraction=rdd1.subtract(rdd2)
    set_substraction.collect().foreach(println)
  }

}
