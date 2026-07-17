public class p3_3 {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=0,c=0,count=0;
        for(a=1;a<=n;a++)
        {
            for(b=1;b<=n;b++)
            {
                for(c=1;c<=n;c++)
                {
                    if(a*a+b*b==c*c)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
//Input: n = 5
//Output: 2