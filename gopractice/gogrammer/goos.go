package main

import (
	"os"
	"fmt"
	"bufio"
	"io"
)

func main() {
	file,err:= os.Open("/Users/zhaofan/go_project/src/go_dev/07/ex13/main.go")
	if err!= nil{
		fmt.Println("open file is err:",err)
		return
	}
	//这里切记在打开文件的时候跟上defer 关闭这个文件，防止最后忘记关闭
	defer file.Close()
	inputReader := bufio.NewReader(file)
	for {
		inputString,readError:= inputReader.ReadString('\n')
		// 这里readError == io.EOF表示已经读到文件末尾
		if readError ==io.EOF{
			return
		}
		// 下面会把每行的内容进行打印
		fmt.Printf("the input is:%s",inputString)
	}
}
