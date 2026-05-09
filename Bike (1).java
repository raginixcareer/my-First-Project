class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

public class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is riding");
    }

    public static void main(String[] args) {
        Bike b = new Bike();

        b.start();  // parent class method
        b.ride();   // child class method
    }
}
