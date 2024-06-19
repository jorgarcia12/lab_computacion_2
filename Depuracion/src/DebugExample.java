public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int resultAdd = add(a, b);
        int resultMultiply = multiply(a, b);
        System.out.println("Result add: " + resultAdd);
        System.out.println("Result multiply: " + resultMultiply);
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int multiply(int x, int y) {
        int mult = x * y;
        return mult;
    }
}
