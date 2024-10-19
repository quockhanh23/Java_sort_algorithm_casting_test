package Genneric;

import java.util.function.Function;

public class GenericFunction {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void testFunction(Function<GenericFunction, String> function) {
        GenericFunction genericFunction = new GenericFunction();

        String result = function.apply(genericFunction);
        System.out.println(result);
    }

    public static void main(String[] args) {
        GenericFunction genericFunction = new GenericFunction();
        genericFunction.setTest("Hello, World!"); // Đặt giá trị cho test
        genericFunction.testFunction(GenericFunction::getTest); // Gọi testFunction trên đối tượng test01
    }
}
