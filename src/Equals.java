public class Equals {

    public void number(int number) {
        System.out.println(number++);
        System.out.println(++number);
    }

    // == so sánh cả địa chỉ ô nhớ ở đâu (heap hay stack)
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
        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println("c = d?");
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println("-------------------------------------");
        // Tất cả integer có giá trị từ -128 đến 127 sẽ được lưu vào bộ nhớ cache của lớp Integer (bộ nhớ cache nằm trong heap)
        // Cùng trỏ đến 1 đối tượng
        System.out.println("Integer: -128 -> 127");
        System.out.println("k = h?");
        Integer k = 500;
        Integer h = 500;
        System.out.println(k == h); // False
        System.out.println(k.equals(h)); // True
        Integer g = 1;
        Integer y = 1;
        System.out.println(g == y); // True
        System.out.println(g.equals(y)); // True
        System.out.println("-------------------------------------");
        System.out.println("String pool");
        String str = "Hello";
        String str2 = new String("Hello").intern();
        String str3 = new String("Hello");

        // Phương thức intern() là một phương thức của lớp String trong Java. Khi gọi phương thức này trên một đối tượng chuỗi,
        // nó sẽ kiểm tra xem chuỗi đó đã có trong String pool hay chưa. Nếu chuỗi đã tồn tại trong pool,
        // phương thức intern() trả về tham chiếu đến chuỗi từ pool. Ngược lại, nếu chuỗi chưa tồn tại trong pool,
        // nó sẽ thêm chuỗi mới vào pool và trả về tham chiếu đến chuỗi đó.

        //Phương thức intern() thường được sử dụng để tiết kiệm bộ nhớ khi bạn có nhiều biến String chứa cùng một giá trị.
        // Thay vì tạo ra nhiều đối tượng chuỗi giống nhau trong bộ nhớ heap,
        // bạn có thể sử dụng intern() để chỉ tham chiếu đến một đối tượng duy nhất trong String pool.
        System.out.println(str == str2); // True
        System.out.println(str.equals(str3)); // True
        System.out.println(str == str3); // false
        System.out.println("-------------------------------------");
        System.out.println("Character");
        Character character = 1;
        Character character2 = 1;
        System.out.println(character == character2);
        System.out.println(character.equals(character2));
        Character character3 = 128;
        Character character4 = 128;
        System.out.println(character3 == character4);
        System.out.println(character3.equals(character4));
        //Byte: Khoảng giá trị từ -128 đến 127.
        //Short: Khoảng giá trị từ -32768 đến 32767.
        //Character: Khoảng giá trị từ 0 đến 127 (cho các ký tự ASCII).
    }
}
