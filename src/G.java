public class G {
    public void array(String alo) {
        for (int i = 0; i < alo.length(); i++) {
            System.out.println(alo.charAt(i));
        }
    }

    public void number(int number) {
        System.out.println(number++);
        System.out.println(++number);
    }

    public static void main(String[] args) {
        G g = new G();
        String arr = "khánh";
        g.array(arr);
        g.number(1);
        String alo1 = new String("alo");
        String alo2 = "alo";
        System.out.println(alo1.equals(alo2));
        System.out.println(alo1 == alo2);
        System.out.println(alo1.compareTo(alo2));
        Integer a = 1;
        Integer b = 1;
        System.out.println("a=b?");
        System.out.println(a == b);
        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println("c=d?");
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println("-------------------------------------");
        //tất cả integer có giá trị từ -128 đến 127 sẽ được lưu vào bộ nhớ cache của lớp Integer
        // cùng trỏ đến 1 đối tượng
        Integer k = 500;
        Integer h = 500;
        System.out.println(k == h);
        System.out.println(k.equals(h));

    }
}