import java.util.HashMap;
import java.util.Map;

public class p1_4 {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }
}
//Input:
//banana
//
//Output:
//b -> 1
//a -> 3
//n -> 2