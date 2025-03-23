import org.apache.spark.SparkContext
object ScalaSparkAssignment1P4 {
  def main(args: Array[String]):Unit ={
    val sc = new SparkContext("local[*]","FilterEven")
    val data = Array(3,6,9,12,15,18,21,24)
    val rdd = sc.parallelize(data)
    val rdd1=rdd.filter(x => x%2==0)
    rdd1.collect().foreach(println)

  }

}
