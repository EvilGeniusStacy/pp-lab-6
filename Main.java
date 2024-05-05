import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("x", 1000.0, 1, "2004-01-01", "praca1");
        Worker worker2 = new Worker("y", 1200.0, 2, "2005-06-06", "praca2" );
        Worker worker3 = new Worker("z", 1400.0, 3, "2005-06-08", "praca3");
        Worker worker4 = new Worker("a", 1600.0, 4, "2008-05-05", "praca4");
        Manager manager = new Manager("b", 2000.0, 5, "2001-01-01", "praca5");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
        
        for (Employee employee: employees){
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
    }
}
