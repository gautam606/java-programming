import java.util.Arrays;

public class p_24 {
    public static void main(String[] args) {
        String s="Let's code";
        String[]words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=0;i< words.length;i++)
        {
            sb.append(words[i]);
            res.append(sb.reverse());
            res.append(" ");
            sb.setLength(0);

        }
        System.out.println(res);
    }
}
//Input:
//        "Let's code"
//
//Output:
//        "s'teL edoc"


//String rev=words[i];
//            for(int j=rev.length()-1;j>=0;j--)
//        {
//        sb.append(rev.charAt(j));
//        }
//        if(i!= words.length-1)
//        {
//        sb.append(" ");
//            }