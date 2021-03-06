import java.util.*;

public class FindDups {

    static final Comparator<String> IGNORE_CASE
            = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> s = new TreeSet<String>(IGNORE_CASE);
        for (String a : args) {
            s.add(a);
        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}