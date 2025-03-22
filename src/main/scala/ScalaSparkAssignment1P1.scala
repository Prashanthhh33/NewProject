import org.apache.spark.SparkContext
object ScalaSparkAssignment1P1 {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local[*]","BigData")
    val data = Array(10,20,30,40,50,60,70,80,90,100)
    val rdd = sc.parallelize(data)
    rdd.collect().foreach(println)
  }

}
