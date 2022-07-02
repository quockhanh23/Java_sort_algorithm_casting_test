package TestInterface;

  interface ITest {


    String publicMethod();

    default void defaultMethod() {
    }

    private String staticMethod() {
        return null;
    }
}
