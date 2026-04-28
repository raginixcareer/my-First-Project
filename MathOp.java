public class MathOp {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOp m = new MathOp();

        System.out.println("Sum of 2 numbers: " + m.add(2, 3));
        System.out.println("Sum of 3 numbers: " + m.add(2, 3, 4));
    }
}