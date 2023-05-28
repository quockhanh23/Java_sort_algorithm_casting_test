package Test_CMC;

import java.util.*;


// Thay 1 số trong chuỗi để chia hết cho 3
public class ChangeNumber {
    public static int aoo(String S) {
        final char[] newString = new char[S.length()];
        int[] newNumber = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            newString[i] = S.charAt(i);
        }
        for (int i = 0; i < newString.length; i++) {
            newNumber[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
        }

        int count = 0;
        Set<String> checkDup = new HashSet<>();
        for (int k = 0; k < S.length(); k++) {
            for (int i = 0; i <= 9; i++) {
                if (newNumber[k] != i) {
                    newNumber[k] = i;
                    String tail = null;
                    String head = null;
                    if (k == 0) {
                        tail = S.substring(k + 1);
                    }
                    if (k > 0) {
                        head = S.substring(0, k);
                        tail = S.substring(k + 1);
                    }
                    String remaining = null;
                    if (k == 0) {
                        remaining = i + tail;
                    }
                    if (k > 0) {
                        remaining = head + i + tail;
                    }
                    int t = Integer.parseInt(remaining);
                    if (t % 3 == 0) {
                        checkDup.add(String.valueOf(t));
                        System.out.println(t);
                        count++;
                    }
                }
            }
            int[] newNumber2 = new int[S.length()];
            for (int i = 0; i < newString.length; i++) {
                newNumber2[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
            }
            newNumber = newNumber2;
        }
        count = checkDup.size();
       return count;
    }

    public static void main(String[] args) {
        String number = "0081";
        ChangeNumber.aoo(number);
    }
}
