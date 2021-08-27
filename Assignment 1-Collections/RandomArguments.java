import java.util.*;

public class RandomArguments {

    public static void main(String[] args) {
        
        // Get and shuffle the list of arguments
        List<String> argsList = Arrays.asList(args);
        Collections.shuffle(argsList);

        // Print out the elements using JDK 8 Streams
        System.out.println("Using Stream and forEach:");
        argsList.stream()
        .forEach(s->System.out.format("%s ",s));

        System.out.println("");

        // Print out the elements using for-each
        System.out.println("Using traditional for:");

        for (String arg: argsList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}