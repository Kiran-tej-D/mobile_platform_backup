import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class uniqueWords {
    public static void main(String[] args) {
        String str = "Hello all my name is kiran i welcome you all thanks for comming for my party";
        Set<String> uniqueWords = Arrays.stream(str.toLowerCase().split("\\s+")).collect(Collectors.toSet());
        System.out.println("Unique Words: ");
        uniqueWords.forEach(System.out::println);
        System.out.println("Number of unique words are: " + uniqueWords.size());
    }
}




