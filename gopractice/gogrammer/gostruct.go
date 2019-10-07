package main

import (
	"fmt"
	"encoding/json"
)

type Student struct {
	Name string
	Age int
	Sex string
	Score int
}
type Student2 struct{
	Name string `json:"name"`
	Age int `json:"age"`
}

func testStruct()  {
	var stu Student
	stu.Name="张三"
	stu.Age=23
	stu.Sex="man"
	stu.Score=100
	fmt.Println("name:%s age:%d score:%d sex:%s\n",stu.Name,stu.Age,stu.Score,stu.Sex)
	fmt.Printf("%+v\n",stu)

	var stu2 Student2
	stu2.Name = "tom"
	stu2.Age = 23

	fmt.Println("==========jsonstruct================")
	data,err := json.Marshal(stu2)
	if err != nil{
		fmt.Printf("json marshal fail fail error:%v",err)
		return
	}
	fmt.Printf("json data:%s\n",data)
}

func main() {
	testStruct()
}
