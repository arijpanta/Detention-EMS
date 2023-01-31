package models;
import java.util.ArrayList;
public class Workplaec extends Work_people {
    private ArrayList<Work_people> employees;

    public Workplaec() {
        super();
        employees = new ArrayList<>();
    }

    public ArrayList<Work_people> getEmployees() {
        return employees;
    }

    public void addEmployee(Work_people employee) {
        employees.add(employee);
    }

    public void removeEmployee(Work_people employee) {
        employees.remove(employee);
    }

    public String toString() {
        return "Company[employees=" + employees + "]";
    }
}