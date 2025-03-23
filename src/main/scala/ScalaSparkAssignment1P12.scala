import org.apache.spark.SparkContext
object ScalaSparkAssignment1P12 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = Array("apple", "banana", "apple", "orange", "banana", "apple")
    val rdd = sc.parallelize(data)
    val rdd1=rdd.map(x => (x,1)).reduceByKey((x,y)=>x+y)
    rdd1.collect().foreach(println)
  }

}
