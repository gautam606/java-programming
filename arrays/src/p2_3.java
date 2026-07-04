import java.util.Arrays;

public class p2_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // rotate right by 2
        int n = arr.length;

        // normalize k (in case k > n)
        k = k % n;

        // create new array
        int[] rotated = new int[n];

        // copy last k elements to front
        for (int i = 0; i < k; i++) {
            rotated[i] = arr[n - k + i];
        }
        System.out.println("Rotate Right: " + Arrays.toString(rotated));
        // copy remaining elements
        for (int i = k; i < n; i++) {
            rotated[i] = arr[i - k];
        }

//        System.out.println("Rotate Right: " + Arrays.toString(rotated));
    }
}
