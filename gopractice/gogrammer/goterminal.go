package main

import (
	"fmt"
	"bufio"
	"os"
)

/**
	从终端读取一行字符串，统计英文，数字，空格以及其他字符的数量
 */

func judgeConut(str string)  {
	var countNum,countLetter,countSpace,countOther int
	for _,v:=range str{
		if v>='a' && v<='z' || v>='A' && v<='Z' {
			countLetter++
		}else if v>='0' && v<='9' {
			countNum++
		}else if v==' ' {
			countSpace++
		}else {
			countOther++
		}
	}
	fmt.Println(countLetter)
	fmt.Println(countNum)
	fmt.Println(countSpace)
	fmt.Println(countOther)
}

func main() {
	fmt.Println("请输入一行字符串")
	var inputReader *bufio.Reader
	inputReader=bufio.NewReader(os.Stdin)
	str,err:=inputReader.ReadString('\n')
	if err!=nil{
		fmt.Println("输入正确的")
	}
	judgeConut(str)
}
