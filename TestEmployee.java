class Employee {
    double salary() {
        return 20000;
    }
}

class Manager extends Employee {
    // overriding
    double salary() {
        return 50000;
    }
}

class Developer extends Employee {
    // overriding
    double salary() {
        return 40000;
    }
}

public class TestEmployee {
    public static void main(String[] args) {

        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println("Manager Salary: " + e1.salary());
        System.out.println("Developer Salary: " + e2.salary());
    }
}