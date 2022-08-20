package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ConvertToStreamExample {

    // Generate Streams from Collections
    public static void streamFromCollection() {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        System.out.println(items.stream().count());
        items.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------------------------------------");
        items.stream() //
                .sorted() //
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

        items.stream().forEach(item -> System.out.println(item));
    }


    // Generate Streams from APIs like Regex
    public static void streamUsingRegex() {
        String str = "Welcome,to,gpcoder";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);// Welcometogpcoder
    }

    public static void main(String[] args) {
        ConvertToStreamExample.streamFromCollection();
        ConvertToStreamExample.streamUsingRegex();

    }
}