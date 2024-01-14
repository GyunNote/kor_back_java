package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김도균1",27));
        students.add(new Student("김도균2",28));
        students.add(new Student("김도균3",29));
        students.add(new Student("김도균4",30));

        System.out.println(students);

        for(int i =0;i<students.size();i++) {
            students.get(i).setAge(students.get(i).getAge() + 1);
        }
        System.out.println(students);

         //   Student student = students.get(i);
         //   student.setAge(student.getAge()+1);

        System.out.println();

        for(Student student : students) {
          student.setAge(student.getAge() + 1);
        }
        System.out.println(students);


        System.out.println();
/*
        System.out.println(students);
        for(int i =0;i<students.size() ;i++) {
            students.set(i, students);
        }
        */
        int i=0;
        Student[] studentArray = new Student[4];
        for(Student student: studentArray){
           studentArray[i] =  new Student("김도균",57);
            System.out.println(studentArray[i]);
        }
        students.set(0,new Student("김도균213",333));
        System.out.println(students);


      //  for(int i =0;i<studentArray.length;i++){
      //       studentArray[i] = new Student("김도균" ,27);
      //   }

    }
}

