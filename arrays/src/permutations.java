public class permutations {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};

        // Step 1: find index i where nums[i] < nums[i+1] from the right
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: if such index exists, find j and swap
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: reverse the rest
        reverse(nums, i + 1, nums.length - 1);

        // Print result
        System.out.println(java.util.Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
//Input: nums = [1,2,3]
//Output: [1,3,2]