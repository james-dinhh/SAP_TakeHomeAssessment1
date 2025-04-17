import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    public static Character firstNonRepeatingChar(String s) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("sapstar"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }
}
