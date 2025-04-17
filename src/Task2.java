import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

    public static Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters("sapstar"));
        System.out.println(countCharacters("aaabbbbcc"));
    }
}
