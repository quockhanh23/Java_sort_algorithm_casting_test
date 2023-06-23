public class This {
    private String name;

    public This() {
    }

    // Từ khóa this phải là câu lệnh đầu tiên trong thân hàm tạo
    public This(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int alo(int x) {
        return x - 1;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(alo(x));
        System.out.println(x);
        String numberPhones = "6639403055";
        numberPhones = new StringBuilder(numberPhones)
                .insert(numberPhones.length() - 8, "-")
                .insert(numberPhones.length() - 5, "-")
                .insert(numberPhones.length() - 2, "-").toString();

        System.out.println(numberPhones);

        String alo = "55000.01";
        alo = alo.indexOf(".") < 0 ? alo : alo.replaceAll("0*$", "").replaceAll("\\.$", "");
        System.out.println(alo);

        String a = null;
        String b = "";

        while (1 == 1) {
            System.out.println("fdfdf");
        }
    }
}
