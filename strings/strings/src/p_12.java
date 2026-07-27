import java.util.HashMap;

public class p_12 {
    public static void main(String[] args) {
        String s = "egg", t = "add";
            boolean isIsomorphic = true;

        if (s.length() != t.length()) {
            isIsomorphic = false;
        } else {
            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character, Character> mapTS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);

                // Check consistency of mapping
                if (mapST.containsKey(c1) && mapST.get(c1) != c2) {
                    isIsomorphic = false;
                    break;
                }
                if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                    isIsomorphic = false;
                    break;
                }

                // Add mapping if not present
                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
        }

        System.out.println(isIsomorphic);
    }
}

//Example 1
//
//Input:
//s = "egg"
//t = "add"
//
//Output:true
//
//Example 2
//
//Input:
//s = "foo"
//t = "bar"
//
//Output:false