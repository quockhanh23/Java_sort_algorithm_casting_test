public class Swap {

    // Hoán đổi giá trị không cần thêm biến
    public static void swap1(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a: " + a + ", b: " + b);
    }
    // Hoán đổi giá trị không cần thêm biến
    public static void swap2(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        Swap.swap1(a, b);
        Swap.swap2(a, b);
    }
}
