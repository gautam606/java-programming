
import java.util.Arrays;

public class p_23 {
    public static void main(String[] args) {
        String s="madam";
        char []arr1=s.toCharArray();
        char []arr2=new char[s.length()];
        for(int i=s.length()-1;i>=0;i--)
        {
            arr2[i]=s.charAt(i);
        }
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
//Input:
//        "madam"
//
//Output:
//        true