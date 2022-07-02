package Test;

public class Final2 extends Final {
    public Final2(String name) {
        super(name);
    }

    public Final2() {
    }

    @Override
    public void sound() {
    }

    public static void main(String[] args) {
        Final2 final2 = new Final2();
        final2.sound();
    }
}
