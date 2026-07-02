public class p2_4 {
    public static void main(String[] args) {
        int arr[] = {45, 12, 78, 3, 25, 67, 10, 45, 89, 16, 290, 47, 12, 25};
        int freq[] = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            freq[i] = -1;
        }


        for (int i = 0; i < arr.length; i++) {
            if (freq[i] != -1) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0;
                }
            }
            freq[i] = count;
        }

        for (int i = 0; i < arr.length; i++) {
            if (freq[i] > 0) {
                System.out.println(arr[i] + " frequency is: " + freq[i]);
            }
        }
    }
}
