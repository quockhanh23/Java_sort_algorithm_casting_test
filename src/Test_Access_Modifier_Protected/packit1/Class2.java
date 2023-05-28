package Test_Access_Modifier_Protected.packit1;

public class Class2 {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class2(String name) {
        this.name = name;
    }

    public Class2() {
    }
}
