public class prefixsum1 {
    public static void main(String[] args) {
       int[] arr = {5, 2, 7, 1, 3};
       int[]prefix=new int[arr.length];
       int[] nums=new int[prefix.length/2];
       //task1
        prefix[0]=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        //task2
        int k=4,j=2;
        int sumrnage=prefix[k]-prefix[j-1];
        System.out.println(sumrnage);
        for(int i=0;i< prefix.length;i++)
        {
            System.out.println(prefix[i]);
        }
    }
}
