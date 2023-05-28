package Test_CMC;

import java.util.Arrays;

public class Bai4 {
    public static int test(Integer[] A) {

        int min = A[0];
        int max = A[0];
        int checkArr = 0;

        int[] arrNewSubtraction = new int[A.length];
        for (Integer integer : A) {
            if (integer < min) {
                min = integer;
            }
            if (integer > max) {
                max = integer;
            }
        }
        if (max == min) {
            return checkArr;
        }
        if (max == 3) {
            int tb = 2;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == tb) {
                    arrNewSubtraction[i] = A[i];
                }
                if (A[i] > tb) {
                    arrNewSubtraction[i] = A[i] - (A[i] - tb);
                    checkArr = checkArr + 1;
                }
                if (A[i] < tb) {
                    arrNewSubtraction[i] = A[i] + (tb - A[i]);
                    checkArr = checkArr + 1;
                }
            }
            System.out.println(Arrays.toString(arrNewSubtraction));
            return checkArr;

        }
        if (max == 4) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == min) {
                    arrNewSubtraction[i] = min;
                }
                if ((A[i] <= max) && (A[i] > min)) {
                    int difference = max;
                    if (A[i] == max) {
                        while (difference != min) {
                            difference = difference - 1;
                            if (difference == min) {
                                arrNewSubtraction[i] = difference;
                            }
                            checkArr = checkArr + 1;
                        }
                    }
                    if (A[i] < max) {
                        difference = max - A[i];
                        while (difference != min) {
                            difference = difference - 1;
                            checkArr = checkArr + 1;
                            if (difference == min) {
                                arrNewSubtraction[i] = min;
                            }
                        }
                    }
                }
            }
        }
        return checkArr;
    }

    public static void main(String[] args) {
        Integer arr[] = {3, 2, 1, 1, 2, 3, 1};
        Integer arr2[] = {2, 2, 4, 1};
        Integer arr4[] = {4, 1, 4, 1};
        Integer arr3[] = {3, 3, 3};
        Bai4.test(arr2);
    }
}
