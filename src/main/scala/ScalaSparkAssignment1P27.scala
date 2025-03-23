import org.apache.spark.SparkContext
object ScalaSparkAssignment1P27 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val data = List("Spark is great", "Big Data is powerful", "Spark makes Big Data easy")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.flatMap(x=>x.split(" "))
    val rdd2 = rdd1.map(x=>(x,1))
    val rdd3 = rdd2.reduceByKey((x,y)=>x+y)
    val rdd4 = rdd3.sortBy(x=>x._2, ascending = false)
    rdd4.take(5).foreach(println)

  }
}
