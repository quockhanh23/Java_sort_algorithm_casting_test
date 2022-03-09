package TH3;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbersArr = {5, 4, 1, 9, 8, 7, 6, 3, 2, 0};
        selectionSort(numbersArr);
        for (int j : numbersArr) {
            System.out.print(j + "\t");
        }
    }
}
