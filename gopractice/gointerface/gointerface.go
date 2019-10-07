package main

import "fmt"

//声明一个接口
type USB interface {
	Name() string
	Connect()
}


//声明一个结构去实现接口
type Phone struct {
	name string
}


func (pc Phone) Name() string {
	return pc.name
}

func (pc Phone) Connect() {
	fmt.Println(pc.Name(), "已经成功连接")
}


func main() {
	var a USB
	a=Phone{"我的电脑"}
	a.Connect()
}
