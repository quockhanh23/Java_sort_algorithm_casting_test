public class Equals {

    public void number(int number) {
        System.out.println(number++);
        System.out.println(++number);
    }

    // == so sánh cả địa chỉ ô nhớ ở đâu(heap hay stack)
    // equals so sánh giá trị
    // compareTo nếu bằng nhau trả về 0 (so sánh giá trị)
    public static void main(String[] args) {
        int blo1 = 10;
        int blo2 = 10;
        System.out.println(blo1 == blo2);
        System.out.println("----------------String---------------");
        String alo1 = new String("alo");
        String alo2 = "alo";
        String alo3 = "alo";
        System.out.println(alo2 == alo3);
        System.out.println(alo1.equals(alo2));
        System.out.println(alo1 == alo2);
        System.out.println(alo1.compareTo(alo2));
        System.out.println("---------------Integer---------------");
        Integer a = 1;
        Integer b = 1;
        System.out.println("a = b? (==)");
        System.out.println(a == b);
        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println("c = d?");
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println("-------------------------------------");
        //tất cả integer có giá trị từ -128 đến 127 sẽ được lưu vào bộ nhớ cache của lớp Integer
        // cùng trỏ đến 1 đối tượng
        System.out.println("k = h?");
        Integer k = 500;
        Integer h = 500;
        System.out.println(k == h);
        System.out.println(k.equals(h));

    }
}