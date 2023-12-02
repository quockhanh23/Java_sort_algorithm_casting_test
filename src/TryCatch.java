public class TryCatch {
    void message() {
        System.out.println("welcome to 1");
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
