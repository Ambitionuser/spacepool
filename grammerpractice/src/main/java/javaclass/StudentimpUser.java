package javaclass;

import java.util.List;

/**
 *
 * 类实现接口必须要实现接口的所有方法
 */
public class StudentimpUser implements UserInterface {
    @Override
    public List<Student> getListStudent(String name) {
        return null;
    }

    @Override
    public Student getStudent(String name) {
        Student student = new Student();
        student.setName(name);
        student.setAge(27);
        return student;
    }

    @Override
    public void setStudent(String name) {

    }
}
