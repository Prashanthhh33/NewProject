import org.apache.spark.SparkContext
object ScalaSparkAssignment1P10 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = Array(10,20,30,40,50,60,70,80,90)
    val rdd = sc.parallelize(data,3)
    val rdd1=rdd.mapPartitions(x => Iterator(x.sum))
    rdd1.collect().foreach(println)
  }

}
