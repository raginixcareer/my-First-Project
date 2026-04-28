class Parent {
    void show() {
        System.out.println("This is Parent class");
    }
}

public class Child extends Parent {

    @Override
    void show() {
        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        Parent p = new Child();   // runtime polymorphism
        p.show();
    }
}