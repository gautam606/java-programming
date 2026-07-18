public class p1_2 {
    public static void main(String[] args) {
        String s="Legend";
        String text=s.toLowerCase();
        for(int i=text.length()-1;i>=0;i--)
        {
            System.out.print(text.charAt(i));
        }
    }
}
//Input: "legend"
//
//Output: "dnegel"