//#method-1

import java.util.*;

public class dutchnationalflag {
    public static void main(String[] args) {
       int[] arr= {2,0,1,2,1,0};
        Arrays.sort(arr);
        for(int ele:arr)
        {
            System.out.println(ele);
        }

    }
}
//input=[2,0,1,2,1,0]
//output=[0,0,1,1,2,2]