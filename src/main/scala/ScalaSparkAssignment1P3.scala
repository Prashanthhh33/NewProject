import org.apache.spark.SparkContext
object ScalaSparkAssignment1P3 {
  def main(args: Array[String]):Unit={
    val sc=new SparkContext("local[*]","Mean")
    val data = Array(5,10,15,20,25)
    val rdd= sc.parallelize(data)
    val with_mean = rdd.mean()
    val rdd_sum = rdd.reduce(_+_)
    val rdd1 = rdd.count()
    val without_mean = rdd_sum/rdd1.toDouble
    println(with_mean)
    println(without_mean)
  }

}
