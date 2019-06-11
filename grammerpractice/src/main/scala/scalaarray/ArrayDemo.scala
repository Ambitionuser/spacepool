package scalaarray

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val array = new Array[String](3)
    array(0)="1";
    array(1)="2";

    val ints = new Array[Int](8)
    ints(0)=9;
    ints(1)=1;
    ints(2)=5;
    ints(3)=6;
    ints(4)=2;



    var array1=Array("fsfsa","chenyanning");
    //输出数组元素
    for (x<-array){
      println(x)
    }

    //求最大数据元素
    var tmp=0;
    for(x<- ints){
      if(tmp<x){
        tmp=x;
      }
    }
    println("tmp:"+tmp);

    var tmp1=0;
    for(i <-0 to (ints.length-1)){
      if (tmp1<ints(i)) tmp1=ints(i);
    }
    println("tmp1:"+tmp1)



  }

}
