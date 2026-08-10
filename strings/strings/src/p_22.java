import java.util.ArrayList;

public class p_22 {
    public static void main(String []args){
        String s = "abc" ,t = "cbad";
        boolean issubseq=false;
        int subcount=0,i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if (s.charAt(i) == t.charAt(j))
                {
                    i++;
                }
            j++;
        }
        if(i==s.length())
        {
            issubseq=true;
        }
        System.out.println(issubseq);
    }
}
//s = "abc"
//t = "ahbgdc"
//output:true