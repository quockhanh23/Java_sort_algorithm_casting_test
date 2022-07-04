package Test;

public class Super2  extends Super1{
    void message() {
        System.out.println("welcome to java");
    }
        void display() {
            message();// gọi phương thức message() của lớp hiện tại
            super.message();// gọi phương thức message() của lớp cha
        }
    public static void main(String args[]) {
        Super2 s = new Super2();
        s.display();
    }
}
