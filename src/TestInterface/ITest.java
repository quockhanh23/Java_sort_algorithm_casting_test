package TestInterface;

 interface ITest {
    public static final String name = "124";
    public static String test = "124";

    public String publicMethod();

    default void defaultMethod() {
        int alo = 1;
    }

    private String staticMethod() {
        return null;
    }


}
