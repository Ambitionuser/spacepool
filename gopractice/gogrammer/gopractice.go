package main

import (
	a "fmt"
)

func add_num(n int)  {
	for i:=0;i<=n;i++ {
		a.Println("%d+%d=%d\n",i,n-i,n)
	}
}

func init(){
	a.Println("执行初始化函数")
}

func reverseStr(str1 string)  {
	var runes = []rune(str1)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	res := string(runes)
	a.Println(res)
}
func main() {
	add_num(5)
	reverseStr("twesaeaeata")
}

