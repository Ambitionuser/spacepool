package main

import(
	"fmt"
	"time"
)


//方法
func test_print(a int){
	fmt.Println(a)
}


/**
管道，先进先出（chan定义管道）
 */
func test_pipe()  {
	pipe :=make(chan int,3)
	pipe <-1
	pipe <-2
	pipe <-3
	fmt.Println(len(pipe))
}

/**
	一个函数可以返回多只
 */
func test_calc(a int,b int)(int,int)  {
	sum:= a+b
	avg:= sum/2
	return sum,avg
}


/**
	常量，变量，作用域
 */

const cbb string  ="hello"
const (
	ca=iota
	cb
	cc
)
var va string ="zhangsan"

func n()  {
	fmt.Println(va)
}
func m()  {
	va:="jack"
	fmt.Println(va)
}

/**
	指针类型
 */
var tmp1 int =10
var tmp2 *int

/**
	定义数组
 */
var arrayint=[5]int{1,2,3,4,5}
var arrayint2=[...]int{1,2,3,4,5}
var arraystring=[2]string{"go","python"}
/**
	slice
 */
var sliceint[]int =[]int{1,2,4,5,6,7}


func main() {
	for i:=0;i<100;i++ {
		test_print(i)
	}
	time.Sleep(time.Second)
	test_pipe()
	fmt.Println("=============函数==================")
	sum,avg:=test_calc(100,200)
	fmt.Println(sum,avg)
	//有多个返回值，只需要返回一个
	sum2,_ := test_calc(100,200)
	fmt.Println(sum2)
	fmt.Println("============常量，变量，作用域=======")
	fmt.Println(cc)
	n()
	m()
	n()
	fmt.Println("============指针类型，地址，指针指向的值=======")
	fmt.Println(&tmp1)
	tmp2=&tmp1
	fmt.Println(*tmp2)
	*tmp2=100
	fmt.Println(tmp1)
	fmt.Println("============数组=======")
	for i,v:=range arrayint{
		fmt.Println("%i %v\n",i,v)
	}
	for _,v:=range arrayint{
		fmt.Println("%v\n",v)
	}

	fmt.Println("============map=======")
	var mapa=make(map[string]string,10)
	//插入和更新
	mapa["hello"]="world"
	//查找
	findvalue:=mapa["hello"]
	fmt.Println(findvalue)
	//遍历
	for k,v:=range mapa{
		fmt.Println(k,v)
	}
	//删除
	delete(mapa,"hello")
	fmt.Println("------",findvalue)

}

