package main

import (
	"sort"
	"fmt"
)

func main() {
	//对整数排序
	var s=[]int{2,3,5,6,7}
	sort.Ints(s)
	fmt.Println(s)

	//对字符串排序
	var b=[]string{"cc","yy","dd","zz"}
	sort.Strings(b)
	fmt.Println(b)

	//对浮点数排序
	var d=[]float64{9.1,1.2,2.3}
	sort.Float64s(d)
	fmt.Println(d)
}
