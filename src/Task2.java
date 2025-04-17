import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

    /**
     * Counts the occurrences of each character in a string.
     *
     * @param s The input string.
     * @return A LinkedHashMap containing each character and its count.
     */
    public static Map<Character, Integer> countCharacters(String s) {
        // Use LinkedHashMap to maintain the order in which characters appear
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Iterate over each character and count its occurrences
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Character count for 'sapstar': " + countCharacters("sapstar"));
        System.out.println("Character count for 'aaabbbbcc': " + countCharacters("aaabbbbcc"));
    }
}
