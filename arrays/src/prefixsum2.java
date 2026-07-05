import java.util.*;

public class prefixsum2 {
    public static void main(String[] args) {

        int[] arr = {23, 2, 4, 6, 7};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1); // important trick
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int rem = (k == 0) ? sum : sum % k;

            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);

                if (i - prevIndex >= 2) {
                    System.out.println(true);
                    return;
                }
            } else {
                map.put(rem, i);
            }
        }

        System.out.println(false);
    }
}