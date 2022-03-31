package TH3;

public class SelectionSort {
    // sắp xếp chọn
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i;
            while (j > 0 && value < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
        }
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 9, 8, 7};
        selectionSort(array);
        System.out.println("");
        insertionSort(array);
    }
}
