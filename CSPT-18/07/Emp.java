abstract class Employee {

    abstract public double salary(double a);
    abstract public String info(String t);
}

class Manager extends Employee {

    @Override
    public double salary(double a) {
        return a;
    }

    @Override
    public String info(String t) {
        return t;
    }
}

class Programmer extends Employee {

    @Override
    public double salary(double a) {
        return a;
    }

    @Override
    public String info(String t) {
        return t;
    }
}

public class Emp {

    public static void main(String[] args) {

        Manager m = new Manager();
        Programmer p = new Programmer();

        System.out.println("Manager Salary : " + m.salary(5000));
        System.out.println("Manager Info   : " + m.info("Manager"));

        System.out.println();

        System.out.println("Programmer Salary : " + p.salary(15000));
        System.out.println("Programmer Info   : " + p.info("Programmer"));
    }
}