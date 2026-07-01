public class smallestele {
    public static void main(String[] args) {
        int[]arr={3,4,6,2,67,12,64};
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
