package models;

public class Work_people {
    private int id;
    private String name;
    private double salary;

    public Work_people(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Work_people() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + name + ",salary=" + salary + "]";
    }
}
