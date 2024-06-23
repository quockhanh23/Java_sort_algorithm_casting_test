package Test_CMC;

public class Bai2 {
    public int solution(String A) {
        int[] newArr = convertStringToArrayZeroOne(A);

        if (newArr.length == 1) {
            return -1;
        }

        int count = 0;
        int index = 0;

        if (newArr[0] + newArr[1] == 2) {
            return -1;
        }

        if (newArr[newArr.length - 2] + newArr[newArr.length - 1] == 2) {
            return -1;
        }

        String[] newRef = A.split("H-");
        String[] newRef2 = A.split("-H");

        if (!check(newRef)) {
            return -1;
        }

        if (!check(newRef2)) {
            return -1;
        }

        while (index < newArr.length - 1) {
            if (newArr[index] + newArr[index + 1] == 1) {
                count++;
                index = index + 2;
            } else {
                index = index + 1;
            }
        }

        if (newRef.length == count || newRef2.length == count) {
            return count % 2 > 0 ? count / 2 + 1 : count / 2;
        }
        return count;
    }

    public boolean check(String[] check) {

        for (int i = 0; i < check.length; i++) {
            if (check[i].equals("")) {
                continue;
            }
            int[] ints = convertStringToArrayZeroOne(check[i]);

            int count = 0;
            for (int j = 0; j < ints.length; j++) {
                count = count + ints[j];
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public int[] convertStringToArrayZeroOne(String a) {
        String[] split = a.split("");
        int[] newArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            newArr[i] = split[i].equalsIgnoreCase("-") ? 0 : 1;
        }
        return newArr;
    }

    // Cách 2
    public int solution2(String S) {
        int a = 0;
        if (S.length() < 2 || S.indexOf('H') == -1 || S.indexOf('-') == -1)
            return -1;
        StringBuilder b = new StringBuilder(S);
        int length = b.length();
        if (b.charAt(0) == 'H') {
            if (b.charAt(1) == 'H')
                return -1;
            else {
                b.replace(1, 2, "T");
            }
        }
        if (b.charAt(length - 1) == 'H') {
            if (b.charAt(length - 2) == 'H')
                return -1;
            else {
                b.replace(length - 2, length - 1, "T");
            }
        }

        for (int i = 1; i < length - 1; i++) {
            if (b.charAt(i) == 'H') {
                if (b.charAt(i - 1) == 'H' && b.charAt(i + 1) == 'H')
                    return -1;
                if (b.charAt(i - 1) != 'T' && b.charAt(i + 1) != 'T') {
                    if (b.charAt(i + 1) == '-') {
                        b.replace(i + 1, i + 2, "T");
                    } else {
                        b.replace(i - 1, i, "T");
                    }
                }
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'T')
                a++;
        }
        if (a == 0)
            a = -1;
        return a;
    }

    public static void main(String[] args) {
        String a = "H-H-H--H-";
        Bai2 bai2 = new Bai2();
        System.out.println(bai2.solution(a));
        System.out.println(bai2.solution2(a));
    }
}
