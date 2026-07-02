import java.util.ArrayList;

public class p2_5 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();

        
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
