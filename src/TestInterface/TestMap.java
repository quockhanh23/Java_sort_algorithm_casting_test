package TestInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    @Override
    public String toString() {
        return "alo";
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
    }
}
