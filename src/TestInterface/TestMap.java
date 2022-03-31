package TestInterface;

import java.util.*;

public class TestMap {
    @Override
    public String toString() {
        return super.toString();
    }

    //Chỉ cho phép 1 key null và nhiều value null
    public static void main(String[] args) {
        TestMap alo3 = new TestMap();
        Map<String, TestMap> alo = new HashMap<>();
        alo.put("1", alo3);
        alo.put("2", null);
        alo.put("3", null);
        alo.put(null, null);

        System.out.println(alo);
        System.out.println(alo.size());
        Set<String> alo2 = new HashSet<>();
        alo2.add("1");

        System.out.println(alo2.size());
        System.out.println(alo2.toString());

    }
}
