package ex_22_Collection_FrameWork_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Example {
    //The Comparable interface in Java is used to define the natural ordering of objects for a user-defined class.
    // It is part of the java.lang package and it provides a compareTo() method to compare instances of the class.
    // A class has to implement a Comparable interface to define its natural ordering.
    public static void main(String[] args) {
        Student s1  = new Student(107,"Vijay",23);
        Student s2  = new Student(104,"Jai",21);
        Student s3  = new Student(106,"Ajay",27);

        List<Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        Collections.sort(studentList);
        System.out.println(studentList);


    }
}
class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo,String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name); //sorts based on names.
    }
//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo-o.rollNo; //sorts based on RollNo
//    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age; //sorts based on age
//    }
}