package Test_CMC;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void solution(int N, int[] R, int[] C) {
        List<String> list = new ArrayList<>();
        int x = 0;
        int y = 0;
        for (int i = 0; i < N * N; i++) {
            boolean check = false;
            for (int j = 0; j < R.length; j++) {
                if (R[j] == x && C[j] == y) {
                    list.add("B");
                    check = true;
                }
            }
            if (!check) {
                int sum = 0;
                for (int j = 0; j < R.length; j++) {
                    if (R[j] == x - 1 && C[j] == y - 1) {
                        sum++;
                    }
                    if (R[j] == x - 1 && C[j] == y) {
                        sum++;
                    }
                    if (R[j] == x - 1 && C[j] == y + 1) {
                        sum++;
                    }
                    if (R[j] == x && C[j] == y - 1) {
                        sum++;
                    }
                    if (R[j] == x && C[j] == y + 1) {
                        sum++;
                    }
                    if (R[j] == x + 1 && C[j] == y - 1) {
                        sum++;
                    }
                    if (R[j] == x + 1 && C[j] == y) {
                        sum++;
                    }
                    if (R[j] == x + 1 && C[j] == y + 1) {
                        sum++;
                    }
                }
                list.add(sum + "");
            }
            y++;
            if (i > 0 && i % N == N - 1) {
                x++;
                y = 0;
            }
        }
        for (int i = 0; i < N * N; i++) {
            System.out.print(list.get(i));
            if (i > 0 && i % N == N - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {2, 1, 0, 2};
        int[] arr2 = {0, 2, 1, 2};
        Bai3.solution(n, arr1, arr2);
    }
}
