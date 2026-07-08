import java.util.ArrayList;

public class kadanealog2 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSubarray(nums);
    }

    public static void findMaxSubarray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            // If currentSum becomes worse, restart at current element
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            // Update maxSum and record indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Print result
        System.out.println("Maximum Sum = " + maxSum);
        System.out.print("Subarray = [");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
    }
}
