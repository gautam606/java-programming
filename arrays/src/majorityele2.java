import java.util.HashMap;
import java.util.Map;

public class majorityele2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 3, 4, 3, 2};
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:arr)
        {
            if(map.containsKey(ele))
            {
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
            else {
                map.put(ele,1);
            }
        }
        int item=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();   // frequency
                item = entry.getKey();    // element
            }
        }

        System.out.println("Most Frequent Element = " + item);
        System.out.println("Frequency = " + max);
    }
}
//Find the Most Frequent Element
//Most Frequent Element = 3
//Frequency = 3