import java.util.ArrayList;

public class p_20 {
    public static void main(String[] args) {
        String s = "Let's code";
        String arr[] = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i];
            StringBuilder sb=new StringBuilder();
            for(int j=str.length()-1;j>=0;j--)
            {
                sb.append(str.charAt(j));
            }
            list.add(sb.toString());
        }
        String res=String.join(" ",list);
        System.out.println(res);
    }
}

//Input:"Let's code"
//
//Output:"s'teL edoc"


