
import java.util.Arrays;

public class p1_8 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        boolean issorted=false;
        int nums[] = arr.clone();
        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++)
        {
            if(Arrays.equals(nums,arr))
            {
                issorted=true;
            }
        }

        System.out.println(issorted);
    }
}



//        boolean issorted=false;
//        int count=0;
//        for(int i=0;i< arr.length-1;i++)
//        {
//            for(int j=i+1;j< arr.length;j++)
//            {
//                if(arr[i]<arr[j])
//                {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);