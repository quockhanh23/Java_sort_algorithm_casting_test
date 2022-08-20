package cmc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai1 {
    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer a = null;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    a = j;
                }
            }
            if (a != null) {
                map.put(A[i], a);
            }
        }
        List<Integer> sumList = new ArrayList<>();
        if (map.isEmpty()) {
            return -1;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == entry.getKey()) {
                    for (int j = i; j <= entry.getValue(); j++) {
                        sum += A[j];
                    }
                    sumList.add(sum);
                    break;
                }
            }
        }
        int max = sumList.get(0);
        for (int i = 1; i < sumList.size(); i++) {
            if (sumList.get(i) > max) {
                max = sumList.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 8, 1};
        System.out.println(Bai1.solution(arr));
        ;
    }
}
