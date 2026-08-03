import java.util.ArrayList;

public class p_17 {
    public static void main(String[] args) {
        String s = "abcd" ,t = "abcde";
        String st=s.toLowerCase(),tt=t.toLowerCase();
        char ch='a';
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<st.length();i++)
        {
            list.add(st.charAt(i));
        }
        for(char c:tt.toCharArray())
        {
            if(!list.contains(c))
            {
                ch=c;
            }
        }
        System.out.println(ch);
    }
}
//Input:
//s = "abcd"
//t = "abcde"
//
//Output:
//        'e'