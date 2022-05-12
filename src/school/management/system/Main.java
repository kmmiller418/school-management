package school.management.system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher teach = new Teacher(1, "Teach", 10000);
        Teacher prof =  new Teacher(2, "Prof", 15000);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(teach);
        teachers.add(prof);

        Student student1 = new Student(1, "Coolio", 5);
        Student student2 = new Student(2, "Kiddo", 5);
        Student student3 = new Student (3, "Ace", 8);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        School test = new School(teachers, students);

        student1.payFees(15000);
        System.out.println(student1);
        student2.payFees(20000);
        System.out.println(student2);
        student3.payFees(10000);
        System.out.println(student3);

        System.out.println("Test School has earned $" + test.getTotalMoneyEarned());

        teach.receiveSalary(10000);
        prof.receiveSalary(15000);

        System.out.println(teach);
        System.out.println(prof);

        System.out.println("Test School has spent $" + test.getTotalMoneySpent());
        System.out.println("Test School's total profits are $" + test.getTotalMoneyEarned());
    }
}
