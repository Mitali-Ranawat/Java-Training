import java.util.*;
import java.util.stream.Collectors;

public class ListTrim {
    
    public static void main(String[] args) {
        List<String> originalStrings = Arrays.asList(" Java ", " SpringBoot ", " Angular", "React" , "Javascript    ");

        System.out.println("Original list:");
        for (String s : originalStrings) {
            System.out.format("\"%s\"%n", s);
        }

        System.out.println("");
        
        List<String> trimmedStrings = 
        originalStrings.stream().map(String::trim).collect(Collectors.toList());

        System.out.println("Trimmed list:");
        for (String s : trimmedStrings) {
            System.out.format("\"%s\"%n", s);
        }

    }
}