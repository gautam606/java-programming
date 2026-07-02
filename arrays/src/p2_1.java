import java.util.Arrays;

public class p2_1 {
    public static void main(String[] args) {
        int arr[] = {45, 12, 78, 3, 25, 67, 10,45,89,16,290,47};
        int max=Integer.MIN_VALUE,secmax=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                secmax=max;
                max=arr[i];
            }else if(arr[i]>secmax && arr[i]!=max) {
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}
//second largest element

//        Arrays.sort(arr);
//        System.out.println("second largest element:"+arr[arr.length-2]);