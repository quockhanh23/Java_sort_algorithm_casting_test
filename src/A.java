public class A {
    private String nameFather;

    public String getNameFather() {
        return nameFather;
    }

    public A(String nameFather) {
        this.nameFather = nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public A() {
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

    public final String farther2(String name) {
        return "alo123";
    }
}
