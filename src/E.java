import java.util.Scanner;

public class E {
    static String alo1;
    int alo3;
    float alo4;
    String alo2;
    boolean alo;
    int value = 10;

    void change(int value) {
        value += 10;
    }

    static {
        System.out.println("Khối static được gọi");
    }

    // Phương thức static chỉ có thể truy cập đến biến static, phương thức static
    // có thể thay đổi biến static
    public static void methodStatic() {
        alo1 = "alo";
        System.out.println("alo1");
        methodStatic2();
    }

    public static void methodStatic2() {
        alo1 = "alo";
        System.out.println("alo23");
    }

    // Phương thức non static có thể truy cập tất cả các biến, phương thức
    public void nonStatic() {
        System.out.println("alo2");
        methodStatic();
        methodStatic2();
    }

    public void test1(int a) {
        a++;
    }

    public void test2() {
        int a = 1;
        test1(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        E a = new E();
        a.nonStatic();
        a.methodStatic();
        E b = new E();
        System.out.println("value" + b.value + b.value);
        System.out.println("value" + b.value);
        System.out.println("b = " + b.alo3);
        System.out.println("b = " + b.alo);
        System.out.println("b = " + b.alo4);
        b.test2();
        System.out.println("Trước khi thay đổi: " + b.value);
        b.change(10);
        System.out.println("Sau khi thay đổi: " + b.value);
        String av = "alo123";
        String a1 = "Khánh";

        for (int i = 0; i < a1.length(); i++) {
            System.out.println(a1.charAt(i));
            System.out.println( a1.toCharArray());
        }
        System.out.println(av.concat(a1));
        String arr[] = {"a2", "a3"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                System.out.println(arr[i].charAt(j));
            }
        }
    }
}

