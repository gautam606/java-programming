import java.util.HashSet;

public class p_13 {
    public static void main(String[] args) {
        String s = "programming";
        char ch = '\0';
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toLowerCase().toCharArray()) {
            if (set.contains(c)) {
                ch = c; // first repeating character
                break;
            } else {
                set.add(c);
            }
        }

        if (ch == '\0') {
            System.out.println("No repeating character");
        } else {
            System.out.println(ch);
        }
    }
}
