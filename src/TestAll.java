public class TestAll {

    //Tìm max
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Cắt chuỗi
    public static void array(String arr) {
        for (int i = 0; i < arr.length(); i++) {
            System.out.println(arr.charAt(i));
        }
    }

    //Tìm năm nhuận
    public void checkYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Đây là năm nhuận");
        } else if (year % 100 == 0) {
            System.out.println("Không phải là năm nhuận");
        } else if (year % 4 == 0) {
            System.out.println("Là năm nhuận");
        } else {
            System.out.println("không là năm nhuận");
        }
    }

    // Số lần xuất hiện của 1 phần tử
    public void count(String str) {
        int[] counter = new int[200];

        for (int i = 0; i < str.length(); i++)
            counter[str.charAt(i)]++;
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }

    // Tổng các phần tử trong mảng
    public void total(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    // Sắp xếp mảng giảm dần, đổi dấu thành tăng dần
    public static void sortDESC(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 9};
        System.out.println(TestAll.findMax(arr));
        String name = "khánh";
        TestAll a = new TestAll();
        a.array(name);
        a.checkYear(1000);
        String str = "Hello world";
        System.out.println("Chuỗi là: " + str);
        a.count(str);
        a.total(arr);
        sortDESC(arr);
        System.out.println("Dãy số được sắp xếp giảm dần: ");
        show(arr);
    }
}
