import java.util.ArrayList;
import java.util.HashSet;

public class majorityele3 {
    public static void main(String[] args){
       int[] nums = {4,3,2,7,8,2,3,1};

       int n= nums.length;
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list =new ArrayList<>();
        for(int ele:nums)
        {
            set.add(ele);
        }
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
//Find All Numbers Disappeared in an Array.
//nums = [4,3,2,7,8,2,3,1]
//
//The array length is
//
//8
//4 3 2 7 8 2 3 1
//Which numbers are missing?
//
//5
//6
//
//Answer:
//
//[5,6]