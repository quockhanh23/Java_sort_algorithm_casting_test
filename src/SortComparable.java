import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortComparable implements Comparable<SortComparable> {
    private String name;

    public SortComparable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortComparable() {
    }

    @Override
    public int compareTo(SortComparable o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] sortingWithList) {
        List<SortComparable> simpsons = new ArrayList<>();
        simpsons.add(new SortComparable("Lisa "));
        simpsons.add(new SortComparable("Homer "));
        simpsons.add(new SortComparable("Marge "));
        simpsons.add(new SortComparable("Bart "));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);
    }
}
