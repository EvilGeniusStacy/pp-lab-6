import company.models.Manager;
import company.models.Worker;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("x", 1000.0, 1, "2004-01-01", "praca1");
        Worker worker2 = new Worker("y", 1200.0, 2, "2005-06-06", "praca2" );
        Worker worker3 = new Worker("z", 1400.0, 3, "2005-06-08", "praca3");
        Worker worker4 = new Worker("a", 1600.0, 4, "2008-05-05", "praca4");
        Manager manager = new Manager("b", 2000.0, 5, "2001-01-01", "praca5");

    System.out.println(worker1.getName()+" has code: "+worker1.hashCode());
    System.out.println(worker2.getName()+" has code: "+worker2.hashCode());
    System.out.println(worker3.getName()+" has code: "+worker3.hashCode());
    System.out.println(worker4.getName()+" has code: "+worker4.hashCode());
    System.out.println(manager.getName()+" has code: "+manager.hashCode());
    
    System.out.println(worker1.getName()+" equal worker2 " + worker1.equals(worker2));
    System.out.println(worker1.getName()+" equal worker4 " + worker1.equals(worker4));
    System.out.println(worker1.getName()+" equal manager " + worker1.equals(manager));
    }
}
