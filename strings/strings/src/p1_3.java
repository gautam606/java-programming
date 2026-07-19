public class p1_3 {
    public static void main(String[] args) {
        String s="madam";
        String text=s.toLowerCase();
        boolean ispalin=false;
        int left=0,right=text.length()-1;
        while(left<right)
        {
            if(text.charAt(left)==text.charAt(right))
            {
                ispalin=true;
            }
            left++;
            right--;
        }
        if(!ispalin)
        {
            System.out.println("text is not Palindrome");
        }
        else {
            System.out.println("text is a Palindrome ");
        }
    }
}
//Input: "madam"
//
//Output:
//Palindrome