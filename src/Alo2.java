public class Alo2 {

    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 3, 2};
        sortDESC(arr);
        System.out.println("Dãy số được sắp xếp giảm dần: ");
        show(arr);
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
}
