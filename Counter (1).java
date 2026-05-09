public class Counter {
    static int count = 0;

    // constructor
    Counter() {
        count++;   // हर object बनने पर count बढ़ेगा
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total Objects Created: " + count);
    }
}
