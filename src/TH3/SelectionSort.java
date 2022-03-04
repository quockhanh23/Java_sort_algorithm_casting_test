package TH3;

public class SelectionSort {

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = Integer.MIN_VALUE;
            int currentMinIndex = 999;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin < list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 6, 7, 2, 10};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
