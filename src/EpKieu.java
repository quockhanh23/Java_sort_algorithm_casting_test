import java.util.ArrayList;

public class EpKieu extends A {
    private int value;
    private String name;
    private String address;

    public EpKieu(String nameFather, int value, String name, String address) {
        super(nameFather);
        this.value = value;
        this.name = name;
        this.address = address;
    }

    public EpKieu(int value, String name, String address) {
        this.value = value;
        this.name = name;
        this.address = address;
    }

    public EpKieu() {
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
        ArrayList<EpKieu> list = new ArrayList<>();
        EpKieu alo2 = new EpKieu(1, "khánh", "Lnog biên");
        list.add(alo2);

        // Ép kiểu từ cha xuống con chỉ dùng được phương thức của lớp cha
        A kaka = new EpKieu();
        System.out.println(kaka.farther1());
        Object ob = new A();
        System.out.println(ob);

        // Lấy đối tượng của cha ép lên con thì mới dùng được phương thức của lớp con
        EpKieu koo = (EpKieu) kaka;
        System.out.println(koo.children());
        kaka.farther3();

        EpKieu epKieu = new EpKieu();
        epKieu.farther3();

        // Chuyển đổi String thành int
        String s = "100";
        int i = Integer.parseInt(s);

        // 10050 vì + là thao tác nối string
        System.out.println(s + 50);

        // 150 vì + là thao tác cộng số nguyên
        System.out.println(i + 50);
    }
}
