import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeintervals2 {
    public static void main(String[] args) {
        int [][]arr={{1,3},{2,6},{8,10}};
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> list = new ArrayList<>();
        int[] current = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int[] next = arr[i];

            if(next[0] <= current[1]) {
                // merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                list.add(current);
                current = next;
            }
        }

        list.add(current);


        for(int[] interval : list) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
