public class Rectangle {
    int length;
    int width;

    // Constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Area method
    int area() {
        return length * width;
    }

    // Perimeter method
    int perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);

        System.out.println("Length: " + r.length);
        System.out.println("Width: " + r.width);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
