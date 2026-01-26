package Collections_Related;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class DuplicatesWords_In_Sentence {

    public static void main(String[] args) {
        String Sentence = "I Live in India I Love India";

        Map<String, Integer> wordcount = new HashMap<>();

        String[] words = Sentence.toLowerCase().split("\\s+");
        System.out.println(Sentence);
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -->" + entry.getValue());
            }
        }
    }

}
