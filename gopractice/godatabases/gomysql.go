package main

import (
	"github.com/jmoiron/sqlx"
	_ "github.com/go-sql-driver/mysql"
	"fmt"
)

//golang操作mysql实现curd基础操作
func main() {
	Db,err:=sqlx.Open("mysql","root:123456@tcp(localhost:3306)/godb")
	if err != nil{
		fmt.Println("connect to mysql failed,",err)
		return
	}
	defer Db.Close()
	fmt.Println("connect to mysql success")
	//执行sql语句，切记这里的占位符是？
	result,err := Db.Exec("INSERT INTO user_info(username,sex,email)VALUES (?,?,?)","user01","男","8989@qq.com")
	if err != nil{
		fmt.Println("insert failed,",err)
	}
	// 通过LastInsertId可以获取插入数据的id
	userId,err:= result.LastInsertId()
	// 通过RowsAffected可以获取受影响的行数
	rowCount,err:=result.RowsAffected()
	fmt.Println("user_id:",userId)
	fmt.Println("rowCount:",rowCount)
}
