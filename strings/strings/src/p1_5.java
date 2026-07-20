public class p1_5 {
    public static void main(String[] args) {
        String s1="listen",s2="silentf";
        int n=s1.length(),count=0,j=0;
        boolean isyes=false;
        for(int i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count==n && s2.length()==n)
        {
            System.out.println(" anagram");
        }
        else {
            System.out.println(" not anagram");
        }
    }
}

//Input:
//listen silent
//
//Output:
//True