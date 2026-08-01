import java.util.LinkedHashMap;
import java.util.Map;


public class p_16 {
    public static void main(String[] args) {
        String input = "swiss";


        Map<Character, Integer> freq = new LinkedHashMap<>();


        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }


        char result = '\0';
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
//Input → "swiss" → Output → "w"
//
//Input → "level" → Output → "v"