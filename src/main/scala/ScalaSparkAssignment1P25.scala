import org.apache.spark.SparkContext
object ScalaSparkAssignment1P25 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List(5, 10, 15, 20, 25)
    val rdd = sc.parallelize(data)
    val sum = rdd.fold(0)((x,y)=>x+y)
    println(sum)
  }
}
