public class p2_6 {
    public static void main(String[] args) {
        int[]nums = {3, 0, 1};
        int[]arr=  {0, 1};
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1=sum1+arr[i];
        }
        for(int j=0;j< arr.length;j++)
        {
            sum2=sum2+j;
        }
        int value=sum1-sum2;
        if(value==0)
        {
            value= arr[arr.length-1]+1;
        }
        System.out.println(value);
    }
}
//missing number