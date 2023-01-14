package Test;

public class TryCatch {
    private String name;

    public TryCatch() {
    }

    public TryCatch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void message() {
        System.out.println("welcome");
    }

    // Try có thể lồng nhau
    void testTryCatch() {
        try {
            System.out.println("welcome");
            try {
                System.out.println("welcome");
                try {
                    System.out.println("welcome");
                } catch (Exception e) {

                    //trong khối catch có thể viết khối try

                    try {
                        System.out.println("welcome");
                    } catch (Exception exception) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
