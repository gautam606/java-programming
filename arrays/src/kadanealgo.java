public class kadanealgo {
    public static void main(String[] args) {
        int arr[]={4, 5, -1, 6, -5, 7};
        int max=Integer.MIN_VALUE,currentsum=0;
        for(int ele: arr)
        {
            currentsum=currentsum+ele;
            max=Math.max(max,currentsum);
            if(currentsum<0)
            {
                currentsum=0;
            }
        }
        System.out.println(max);
    }
}
