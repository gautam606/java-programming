public class largestele {
    public static void main(String[] args) {
        int[]arr={3,4,6,2,67,12,64};
        int max=Integer.MIN_VALUE;
        for(int ele:arr)
        {
            if(ele>max)
            {
                max=ele;
            }

        }
        System.out.println(max);
    }
}
