import java.util.ArrayList;
import java.util.List;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("x", 2000.0, 1, "2004-01-01", "praca1");
        Worker worker2 = new Worker("y", 1200.0, 2, "2005-06-06", "praca2" );
        Worker worker3 = new Worker("z", 1500.0, 3, "2005-06-08", "praca3");
        Worker worker4 = new Worker("a", 1800.0, 3, "2008-05-05", "praca4");
        Manager manager = new Manager("b", 2500.0, 4, "2001-01-01", "praca5");
        Worker worker5=new Worker("c", 1800, 4, "2009-08-20", "praca6");
        Manager manager1 = new Manager("d", 2500.0, 1, "2009-08-20", "praca7");

        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager);
        employees.add(manager1);

        double wyplatarazem=0;
        for(Employee employee: employees){
            wyplatarazem += employee.getSalary();
        }
        double wyplatamenagerow=0;
        for(Employee employee:employees){
            if(employee instanceof Manager){
                wyplatamenagerow += employee.getSalary();
            }
        }
        double wyplatapracownikow=0;
        for(Employee employee : employees){
            if(employee instanceof Worker){
                wyplatapracownikow += employee.getSalary();
            }
        }
        List<Employee> duplikaty= new ArrayList<>();
        for(Employee employee1: employees) {
            for(Employee employee2: employees){
                if(employee1 != employee2 && employee1.getId() == employee2.getId()){
                    duplikaty.add(employee1);
                    break;
                }
            }
        }
        System.out.println("Wypłaty wszystkich pracowników razem: "+wyplatarazem);
        System.out.println("Wyplata Menadżerów razem: "+wyplatamenagerow);
        System.out.println("Wypłata pracowników bez menadżerow razem:" +wyplatapracownikow);
        System.out.println("Duplikaty id:");
        for(Employee employee: duplikaty){
            System.out.println(employee.getName()+ " (ID: " + employee.getId()+ " )");
        }

    }
}
