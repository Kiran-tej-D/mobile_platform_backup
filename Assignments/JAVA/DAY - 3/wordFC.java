import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class wordFC {
    public static void main(String[] args) {
        String str = "This is a test string it contains words and words have frequency";
        Map<String, Long> wordFCM = Arrays.stream(str.toLowerCase().split("\\s+"))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Word frequency: ");
        wordFCM.forEach((word, frequency) ->System.out.println(word + ": " + frequency));
    }
}




