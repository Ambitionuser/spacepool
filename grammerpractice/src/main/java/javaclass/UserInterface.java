package javaclass;

import java.util.List;

/**
 * java和scala接口的区别
 * java没有方法体
 * scala有方法体也可以没有方法体
 */
public interface UserInterface {
    List<Student> getListStudent(String name);
    Student getStudent(String name);
    void setStudent(String name);
}
