import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    /**
     * Finds the first non-repeating character in a string.
     *
     * @param s The input string.
     * @return The first non-repeating character, or null if none exists.
     */
    public static Character firstNonRepeatingChar(String s) {
        // Use LinkedHashMap to maintain the order of characters as they appear
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the map to find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return null if no non-repeating character is found
        return null;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("First non-repeating character in 'sapstar': " + firstNonRepeatingChar("sapstar"));
        System.out.println("First non-repeating character in 'aabbcc': " + firstNonRepeatingChar("aabbcc"));
    }
}
