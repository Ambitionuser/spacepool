package sparkcore
import org.apache.spark.{SparkConf, SparkContext}

/**
  * 第一类方式从内存里构造RDD，使用的方法：makeRDD和parallelize
  */
object CoreDemo {
  def main(args: Array[String]): Unit = {
    //创建spark执行的入口
    val sc = new SparkContext((new SparkConf().setAppName("CoreDemo").setMaster("local[4]"))) //本地测试
    val rdd1=sc.parallelize(List(1,3,6,0))
    val rdd2=sc.makeRDD(List(2,3,1,6))

    /*转换
    * map() 参数是函数，函数应用于RDD每一个元素，返回值是新的RDD
    * flatMap() 参数是函数，函数应用于RDD每一个元素，将元素数据进行拆分，变成迭代器，返回值是新的RDD
    * filter() 参数是函数，函数会过滤掉不符合条件的元素，返回值是新的RDD
    * distinct() 没有参数，将RDD里的元素进行去重操作
    * union() 参数是RDD，生成包含两个RDD所有元素的新RDD （求并集）
    * intersection() 参数是RDD，求出两个RDD的共同元素(求交集)
    * subtract() 参数是RDD，将原RDD里和参数RDD里相同的元素去掉,返回前rdd元素不在后rdd存在的数据
    * cartesian() 参数是RDD，求两个RDD的笛卡儿积
    */

    //map练习(一对一)
    val product=(x:Int)=>{
      val z=x*2
      z
    }
    val values1=rdd1.map(x=>x*2)
    val values2=rdd1.map(_*2)
    val values3=rdd2.map(product)
    println(values1.collect().mkString(","))
    println(values2.collect().mkString(","))
    println(values3.collect().mkString(","))
    //filter练习
    val filter1=rdd1.filter(_>2)
    val filter2=rdd1.filter(x=>x>2)
    println(filter1.collect().mkString(","))
    println(filter2.collect().mkString(","))
    val funFilter=(y:Int)=>{
      if(y>3) y
    }
    val filter3=funFilter(Integer.parseInt(rdd1.filter(_>3).collect().mkString(",")))
    println(filter3)

    //flatMap练习（一对多）
    //返回 hello,chen,yan,world,ning,test,chen,yan,yan,ning,ning
    val rdd3 = sc.textFile("F:\\workspace\\spacepool\\grammerpractice\\src\\main\\spark\\sparkcore\\wordcount",1)
    val rdd4 = rdd3.flatMap(x=>x.split(","))
    println(rdd4.collect().mkString(","))

    //distinct去重练习
    //返回 yan,hello,chen,ning,test,world
    val dist = rdd4.distinct()
    println(dist.collect().mkString(","))

    //union并集操作（不去重）
    val unionvalue = rdd1.union(rdd2)
    println(unionvalue.collect().mkString(","))

    //intersection交集操作
    val isvalue=rdd1.intersection(rdd2)
    println(isvalue.collect().mkString(","))

    //subtract
    val sub = rdd1.subtract(rdd2)
    println(sub.collect().mkString(","))

    //cartesian笛卡尔操作
    val car = rdd1.cartesian(rdd2)
    println(car.collect().mkString(","))

    //groupBy(把相同的key的数据分发到一起)




    println("---------------------------------------------------------------------")

    /*行动
    * collect() 返回RDD所有元素
    * count() RDD里元素个数
    * countByValue() 各元素在RDD中出现次数
    * reduce() 并行整合所有RDD数据，例如求和操作
    * fold(0)(func) 和reduce功能一样，不过fold带有初始值
    * aggregate(0)(seqOp,combop) 和reduce功能一样，但是返回的RDD数据类型和原RDD不一样
    * foreach(func) 对RDD每个元素都是使用特定函数
    * */

    //count统计集合rdd中出现的总数量操作
    val count = rdd1.count()
    println(count)

    //countByValue 统计各个元素出现的次数
    val intToLong = rdd1.countByValue()
    println(intToLong)
    val countbyvalue2=rdd3.countByValue()
    println(countbyvalue2)
    val countbyvalue3=rdd4.countByValue()
    println(countbyvalue3)

    //reduce 并行整合所有RDD数据
    val reduce = rdd1.reduce((x,y)=>x+y)
    println(reduce)
    val reduce1=rdd2.reduce((a,b)=>{
      a*b
    })
    println(reduce1)

    //fold 和reduce一样，但是fold带有初始值1,3,6,0
    val fold = rdd1.fold(1)((x,y)=>x+y)
    println("fold:"+fold)

    //aggregate
    val res:(Int,Int) = rdd1.aggregate((0,0))((x,y) => (x._1 + x._2,y),(x,y) => (x._1 + x._2,y._1 + y._2))
    println(res._1 + "," + res._2)

    //forache练习
    rdd1.foreach(x=>
      {println(x*2)}
    )













  }

}
