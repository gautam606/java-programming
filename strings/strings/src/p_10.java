import java.util.HashMap;

public class p_10 {
    public static void main(String[] args) {
        String s="lleetcode";
        char res='a';
        boolean isnonrep=false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++)   {
            char ch=s.charAt(i);
            if(map.get(ch)==1)
            {
                res=ch;
                isnonrep=true;
                break;
            }
        }
        if(!isnonrep)
        {
            System.out.println("no repeating ");
        }
        else {
            System.out.println(res);
        }
    }
}


//Input:"leetcode"
//
//Output:'l'
//
//Example
//
//Input:"aabb"
//
//Output:" "