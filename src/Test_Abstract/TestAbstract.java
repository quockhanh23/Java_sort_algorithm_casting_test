package Test_Abstract;

public class TestAbstract extends Abstract {

    @Override
    public void speak() {
        System.out.println("blo");
    }
    public String xen(){
        return "alo";
    }
    public String xen(String name){
        return "alo";
    }

    public static void main(String[] args) {
        TestAbstract testAbstract = new TestAbstract();
        testAbstract.speak();
    }
}
