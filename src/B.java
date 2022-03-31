import java.util.ArrayList;

public class B extends A {
    private int value;
    private String name;
    private String address;

    public B(String nameFather, int value, String name, String address) {
        super(nameFather);
        this.value = value;
        this.name = name;
        this.address = address;
    }

    public B(int value, String name, String address) {
        this.value = value;
        this.name = name;
        this.address = address;
    }

    public B() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String children() {
        return "children class";
    }

    @Override
    public void farther3() {
        System.out.println("aloFather");
    }

    @Override
    public String farther4(String name) {
        return "alo123";
    }

    @Override
    public String toString() {
        return "B{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<B> list = new ArrayList<>();
        B alo2 = new B(1, "khánh", "Lnog biên");
        list.add(alo2);

        // Ép kiểu từ cha xuống con chỉ dùng được phương thức của lớp cha
        A kaka = new B();
        System.out.println(kaka.farther1());
        Object ob = new A();
        System.out.println(ob);
        // Lấy đối tượng của cha ép lên con thì mới dùng được phương thức của lớp con
        B koo = (B) kaka;
        System.out.println(koo.children());
        kaka.farther3();

        B b = new B();
        b.farther3();


    }
}