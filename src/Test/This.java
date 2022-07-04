package Test;

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

}
