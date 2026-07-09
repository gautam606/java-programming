import java.util.HashMap;

public class majorityele {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2};
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
        System.out.println(map);
    }
}
//Frequency of Each Element
//        1 → 2
//        2 → 3
//        3 → 1
//        4 → 1