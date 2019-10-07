package main

import (
	"net/http"
	"fmt"
	"io/ioutil"
	"net/url"
)

func main() {
	//不带参数
	resp, err := http.Get("http://httpbin.org/get")
	if err != nil {
		fmt.Println(err)
		return
	}
	defer resp.Body.Close()
	body, err := ioutil.ReadAll(resp.Body)
	fmt.Println(string(body))
	fmt.Println(resp.StatusCode)
	if resp.StatusCode == 200 {
		fmt.Println("ok")
	}
	//带参数
	resp2, err2 := http.Get("http://httpbin.org/get?name=zhaofan&age=23")
	if err2 != nil {
		fmt.Println(err2)
		return
	}
	defer resp2.Body.Close()
	body2, _ := ioutil.ReadAll(resp2.Body)
	fmt.Println(string(body2))

	//写入params中
	params := url.Values{}
	Url, err := url.Parse("http://httpbin.org/get")
	if err != nil {
		return
	}
	params.Set("name","zhaofan")
	params.Set("age","23")
	//如果参数中有中文参数,这个方法会进行URLEncode
	Url.RawQuery = params.Encode()
	urlPath := Url.String()
	fmt.Println(urlPath) // https://httpbin.org/get?age=23&name=zhaofan
	resp3,err := http.Get(urlPath)
	defer resp2.Body.Close()
	body3, _ := ioutil.ReadAll(resp3.Body)
	fmt.Println(string(body3))
}
