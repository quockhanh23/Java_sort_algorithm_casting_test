package Test_Static;

import java.util.ArrayList;

public class StaticTest extends Static {
    private String name;
    private int alo;
    private static String address = "ao1";

    public StaticTest(String name, int alo) {
        this.name = name;
        this.alo = alo;
    }

    public StaticTest() {
    }

    public String getName() {
        return this.name;
    }

    public int getAlo() {
        return this.alo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlo(int alo) {
        this.alo = alo;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {

    }

    public static void aloCC() {
        address = "alo 123";
    }

    static {
        System.out.println("Khối static được gọi");
    }

    static {
        address = "Khối static (static blocks)";
    }

    static {
        ArrayList<StaticTest> arrayList = new ArrayList<>();
        arrayList.add(new StaticTest("alo1", 1));
        arrayList.add(new StaticTest("alo2", 1));
        arrayList.add(new StaticTest("alo3", 1));
        arrayList.add(new StaticTest("alo4", 1));
        arrayList.add(new StaticTest("alo5", 1));
        arrayList.add(new StaticTest("alo6", 1));
        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", alo=" + alo + ", address=" + address +
                '}';
    }

    void display() {
        System.out.println(" " + name + " " + alo + " " + address);
    }

    public static void main(String[] args) {
        StaticTest alo1 = new StaticTest("khanh", 1);
        System.out.println(alo1);
        StaticTest.aloCC();
        StaticTest alo2 = new StaticTest("khanh", 1);
        System.out.println(alo2);
        System.out.println(address);
    }
}

