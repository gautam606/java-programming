import java.util.Arrays;

public class p2_2 {
    public static void main(String[] args) {
        int[] arr={0, 1, 0, 3, 12};
        int nums[]=new int[arr.length];
        int i=0,j=0;
        while(i< arr.length)
        {
            if(arr[i]!=0)
            {
                nums[j++]=arr[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
// input=[0, 1, 0, 3, 12]
//output=[1, 3, 12, 0, 0]
