public class mergeintervals {
    public static void main(String[] args) {
        int[][] arr = {{1,4},{4,5}};

        int start = arr[0][0];                 // first interval start
        int end   = Math.max(arr[0][1], arr[1][1]); // merge end

        int[][] result = {{start, end}};       // merged interval

        // Print result
        System.out.println("[" + result[0][0] + "," + result[0][1] + "]");

    }
}
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]