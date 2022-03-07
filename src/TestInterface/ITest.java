package TestInterface;

public interface ITest {
    String publicMethod();

    default void defaultMethod() {
    }
}
