import java.util.*;
public class p_21 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram = true;

        ArrayList<Character> list = new ArrayList<>();


        for (int i = 0; i < s1.length(); i++) {
            list.add(s1.charAt(i));
        }


        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);

            if (list.contains(ch)) {
                list.remove((Character) ch);
            } else {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram && list.isEmpty()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
//String s1 = "listen";
//String s2 = "silent";
//
//output:true