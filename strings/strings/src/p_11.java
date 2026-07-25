import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class p_11 {
    public static void main(String[] args) {
        String s="the sky is blue";
        String[] text = s.toLowerCase().split(" ");
        String [] words=new String[text.length];

        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i= text.length-1;i>=0;i--)
        {
            words[j++]=text[i];
        }
        for(String str:words)
        {
            System.out.print(" "+str);
        }

    }
}
//Input:"the sky is blue"
//
//Output:"blue is sky the"