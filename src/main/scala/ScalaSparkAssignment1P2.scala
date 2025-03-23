import org.apache.spark.SparkContext
object ScalaSparkAssignment1P2 {
  def main(args: Array[String]):Unit = {
    val sc = new SparkContext("local[*]","SaveFile")
    val data = Array(1,2,3,4,5,6,7,8,9,10)
    val rdd = sc.parallelize(data)
    rdd.saveAsTextFile("C:/Users/prash/OneDrive/Desktop/samplefile.txt")

  }


}
