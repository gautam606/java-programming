import java.util.HashSet;

public class p1_6 {
    public static void main(String[] args) {
        String s="programming";
        HashSet<Character>set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            set.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for (char c : s.toCharArray())
        {
            if (set.contains(c))
                sb.append(c);
            set.remove(c);
        }
        System.out.println(sb.toString());
    }
}
//Input:
//programming
//
//Output:
//progamin