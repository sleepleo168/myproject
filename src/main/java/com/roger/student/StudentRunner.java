package com.roger.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
//        com.roger.kotlin.Student.setPass(50);
        Student.pass =50;
        Student stu = new Student("Roger", 77, 99);
        Student stu2 = new Student("Eric", 30, 80);
        Student stu3 = new Student("Jane", 25, 44);
        GraduateStudent gstu = new GraduateStudent("Jack", 55, 65,60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High Score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High Score: " + stu.highest());
    }
}
