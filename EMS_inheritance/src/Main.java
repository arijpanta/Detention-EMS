import models.Work_people;
import models.Workplaec;
public class Main {
    public static void main(String[] args) {
        Workplaec company = new Workplaec();

        Work_people emp1 = new Work_people(1, "Workman1" + " Baun", 8000);
        Work_people emp2 = new Work_people(2, "Workman2", 20000);


        company.addEmployee(emp1);
        company.addEmployee(emp2);



        System.out.println(company);
    }
}




