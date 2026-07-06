public class rangesumarray {
    private int[] nums = {-2, 0, 3, -5, 2, -1};
    private int[] prefix;


    public rangesumarray() {
        prefix = new int[nums.length + 1];
        prefix[0] = 0; // base case
        for (int i = 1; i <= nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
    }


    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        rangesumarray obj = new rangesumarray();

        System.out.print("Prefix array: ");
        for (int p : obj.prefix) {
            System.out.print(p + " ");
        }
        System.out.println();


        System.out.println("Sum(0..2) = " + obj.sumRange(0, 2));
        System.out.println("Sum(2..5) = " + obj.sumRange(2, 5));
        System.out.println("Sum(0..5) = " + obj.sumRange(0, 5));
    }
}
