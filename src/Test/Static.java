package Test;

public class Static {
    private static String test = "1234";
    private String test2;

    public Static(String test2) {
        this.test2 = test2;
    }

    public Static() {
    }

    public static String getTest() {
        return test;
    }

    public static void setTest(String test) {
        Static.test = test;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
