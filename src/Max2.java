import java.util.Arrays;

public class Max2 {
    // Tìm phần tử lớn thứ 2
    // Cách 1
    public static void print1largest(int arr[], int arr_size) {
        int first, second;
        if (arr_size < 2) {
            System.out.print(" Không hợp lệ ");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < arr_size; i++) {
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

    // Cách 2 sắp xếp trước đã kiểm tra tất cả các trường hợp
    public static void print2largest(int arr[], int arr_size) {
        if (arr_size < 2) {
            System.out.print("Mảng chỉ có 1 phần tử");
        } else if (arr_size > 2) {
            Arrays.sort(arr);
            try {
                for (int i = arr_size - 2; i < arr_size; i--) {
                    if (arr[i] != arr[arr_size - 1]) {
                        System.out.printf("Phần tử lớn thứ 2: " + arr[i]);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Các phần tử của mảng đều giống nhau");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2};
        int n = arr.length;
        print2largest(arr, n);
    }
}

