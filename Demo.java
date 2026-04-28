public class Demo {
    int x, y;

    // Default constructor
    Demo() {
        this(10);   // दूसरे constructor को call करेगा
    }

    // One parameter constructor
    Demo(int a) {
        this(a, 20);   // तीसरे constructor को call करेगा
    }

    // Two parameter constructor
    Demo(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
