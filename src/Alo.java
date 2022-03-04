public class Alo {
    static void print2largest(int arr[], int arr_size) {
        int i, first, second;
        if (arr_size < 2) {
            System.out.print(" Không hợp lệ ");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("Không tồn tại phần tử lớn thứ 2 ");
        else
            System.out.print("Phần tử lớn thứ 2: " + second);
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        print2largest(arr, n);
    }
}

