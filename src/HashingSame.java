import java.util.HashSet;

public class HashingSame {

    public static void main(String[] args) {
        String value1 = "FB";
        String value2 = "Ea";
        String value3 = "tensada";
        String value4 = "friabili";

        System.out.println(value1.hashCode());
        System.out.println(value2.hashCode());
        System.out.println(value3.hashCode());
        System.out.println(value4.hashCode());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(value1);
        hashSet.add(value2);
        hashSet.add(value3);
        hashSet.add(value4);
        System.out.println(hashSet);
    }
}
