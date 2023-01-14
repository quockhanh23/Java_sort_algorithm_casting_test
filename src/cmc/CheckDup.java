package cmc;

import java.util.ArrayList;
import java.util.List;

public class CheckDup {

    public static void checkChar(String name) {
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list.add("ja va");

        String alo = name.replaceAll("\\s\\s+", " ");
        String alo2 = alo.replaceAll(" ", "");
        final char[] newString = new char[alo2.length()];
        for (int i = 0; i < alo2.length(); i++) {
            newString[i] = alo2.charAt(i);
            char characters = alo2.charAt(i);
        }
        System.out.println(newString);
        for (int j = 0; j < list.size(); j++) {
            list.get(j).replaceAll("\\s\\s+", " ");
            list2.add(list.get(j).replaceAll(" ", ""));
        }
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < newString.length; j++) {
                if (list2.get(i).charAt(i) == newString[j]) {
                    System.out.println("1lo");
                }
            }
        }
    }

    public static void check(String name) {
        String alo1 = name.trim().toLowerCase();
        System.out.println(alo1.replaceAll("\\s\\s+", " "));

        List<String> list = new ArrayList<String>();
        list.add("ja va");
        list.add("alo12");
        list.add("alo123");
        String alo2 = alo1.replaceAll(" ", "");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).replaceAll("\\s\\s+", " ").equals(alo2)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {

    }
}
