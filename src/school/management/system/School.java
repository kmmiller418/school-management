package school.management.system;
import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int amountEarned) {
        totalMoneyEarned += amountEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int amountSpent) {
        totalMoneySpent += amountSpent;
        totalMoneyEarned -= amountSpent;
    }
}
