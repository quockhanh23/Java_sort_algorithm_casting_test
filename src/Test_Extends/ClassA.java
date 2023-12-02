package Test_Extends;

// Đa hình: các phương thức cùng tên nhưng khác tham số truyền vào, khác kiểu trả về
public class ClassA {
    private String test;

    public void test1() {
        System.out.println("121212");
    }

    public void test1(String a) {
        System.out.println("121212");
    }

    public String test1(Long a) {
        return "1212";
    }
}
