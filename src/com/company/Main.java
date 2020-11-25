package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 =new Student("hung",25,"hanoi");
        Student student2 =new Student("dung",20,"hanoi");
        Student student3 =new Student("tai",22,"hanoi");

        List<Student>list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student student : list){
            System.out.println(student.toString());
        }
        AgeC ageC =new AgeC();
        Collections.sort(list ,ageC);
        System.out.println("so sánh theo tuổi");
        for (Student student : list){
            System.out.println(student.toString());
        }
    }
}
