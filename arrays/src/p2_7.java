import java.util.ArrayList;
import java.util.Arrays;

public class p2_7 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 7, 3};
        int n = arr.length;

        ArrayList<Integer> leaders = new ArrayList<>();


        int maxRight = arr[n - 1];
        leaders.add(maxRight);


        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i]; // update max
            }
        }


        java.util.Collections.reverse(leaders);

        System.out.println("Leaders = " + leaders);
    }
}
 //learder on array
//Leaders = [7, 7, 3]

