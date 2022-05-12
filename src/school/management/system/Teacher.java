package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int earnings;

    public Teacher (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.earnings = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        earnings += salary;
        School.updateTotalMoneySpent(salary);
    }

    public int getEarnings() {
        return earnings;
    }

    @Override
    public String toString() {
        return "Teacher- " + name
                +" Total salary earned: $"
                + earnings;
    }
}


