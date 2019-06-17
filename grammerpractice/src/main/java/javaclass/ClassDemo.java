package javaclass;


public class ClassDemo {
    public static void main(String[] args) {
        Studentextends studentextends = new Studentextends();
        Student student = studentextends.getStudent("chenyanning");
        System.out.println(student.toString());
    }
}
