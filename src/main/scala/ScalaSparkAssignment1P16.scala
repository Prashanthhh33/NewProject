import org.apache.spark.SparkContext
object ScalaSparkAssignment1P16 {
  def main(args: Array[String]):Unit={
    val sc = new SparkContext("local[*]","Count")
    val employees = Array((1, "John"), (2, "Alice"), (3, "Bob"))
    val departments = Array((1, "IT"), (2, "HR"))
    val rdd1 = sc.parallelize(employees)
    val rdd2 = sc.parallelize(departments)
    val left_outer_join=rdd1.leftOuterJoin(rdd2)
    left_outer_join.collect().foreach(println)
  }

}
