package Test;

public class PassByValue {
    private String name = "123456";

    public void test() {
        name = "5555";
        System.out.println(name);
    }

    public void test2(int number) {
        number = number + 1;
        System.out.println(number);
    }


    public static void main(String[] args) {

        PassByValue passByValue = new PassByValue();
        // Tham chiếu
        System.out.println(passByValue.name);
        passByValue.test();
        System.out.println(passByValue.name);
        // Tham trị
        int number = 10;
        passByValue.test2(number);
        System.out.println(number);
    }
}
