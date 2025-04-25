package ex_22_Collection_FrameWork_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example {
    public static void main(String[] args) {
        Student1 s1  = new Student1(107,"Vijay",23);
        Student1 s2  = new Student1(104,"Jai",21);
        Student1 s3  = new Student1(106,"Ajay",27);

        List<Student1> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        Collections.sort(studentList, new RollNoComparator());
        System.out.println(studentList);
        Collections.sort(studentList, new AgeComparator());
        System.out.println(studentList);
        Collections.sort(studentList,new NameComparator());
        System.out.println(studentList);

    }
}

class NameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class RollNoComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getRollNo() - s2.getRollNo();
    }
}
class AgeComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getAge()-s2.getAge();
    }
}
class Student1 {
    private int rollNo;
    private String name;
    private int age;

    public Student1(int rollNo, String name, int age) {
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


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
