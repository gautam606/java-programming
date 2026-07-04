import java.util.ArrayList;

public class p3_2 {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        boolean iscontain=false;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            {
                iscontain=true;
                break;
            }
            else {
                list.add(nums[i]);
            }
        }
        System.out.println(iscontain);
    }
}
