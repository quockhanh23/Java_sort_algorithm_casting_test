public class EpKieu1 {
    private String nameFather;

    public String getNameFather() {
        return nameFather;
    }

    public EpKieu1(String nameFather) {
        this.nameFather = nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public EpKieu1() {
    }

    public String farther1() {
        return "farther class";
    }


    @Override
    public String toString() {
        return "A{" +
                "nameFather='" + nameFather + '\'' +
                '}';
    }

    public String farther4(String name) {
        return "alo123";
    }

    public final String farther2(String name) {
        return "alo123";
    }

    public void farther3() {
        System.out.println("alo123");
    }

    public static void main(String[] args) {
        EpKieu1 epKieu1 = new EpKieu1();
        System.out.println(epKieu1.nameFather);
    }

    public static class Khanh {

    }
}
