import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("x", 1000.0, 1);
        Worker worker2 = new Worker("y", 1200.0, 2);
        Worker worker3 = new Worker("z", 1400.0, 3);
        Worker worker4 = new Worker("a", 1600.0, 4);
        Manager manager = new Manager("b", 2000.0, 5);

        System.out.println("Worker x salary: " + worker1.getSalary());
        System.out.println("Worker y salary: " + worker2.getSalary());
        System.out.println("Worker z salary: " + worker3.getSalary());
        System.out.println("Worker a salary: " + worker4.getSalary());
        System.out.println("Manager salary: " + manager.getSalary());

        worker1.work();
        worker2.work();
        worker3.work();
        worker4.work();
        manager.work();
    }
}
