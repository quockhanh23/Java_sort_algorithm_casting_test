package bubbleSort;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        int[] numbersArr = {5, 4, 1, 9, 8, 7, 6, 3, 2, 10};
        bubbleSort(numbersArr);
        for (int j : numbersArr) {
            System.out.print(j + "\t");
        }
    }
}
