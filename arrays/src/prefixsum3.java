public class prefixsum3 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int prefixsum[]=new int[arr.length];
        prefixsum[0]=arr[0];
        for(int i=1;i< prefixsum.length;i++)
        {
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        for(int i=0;i<prefixsum.length;i++)
        {
            System.out.println(prefixsum[i]);
        }
        System.out.println();
        //Index 1 to 3
        int sumrange=0;
        int left=3,right=1;
        sumrange=prefixsum[left]-prefixsum[right-1];
        System.out.println(sumrange);

        int arrs[] = {5, 2, 7, 3, 6, 1};
        int nums[]=new int[arrs.length];
        nums[0]=arr[0];

        for(int i=1;i< arrs.length;i++)
        {
            nums[i]=nums[i-1]+arrs[i];
        }
        //sum(0,2)
        int r=2;
        int a=arrs[r];
        System.out.println(a);
        //Sum(2, 5)
        int x=2,y=5;
        int total=arrs[y]-arrs[x-1];
        System.out.println(total);
         //Sum(1, 4)

        int ri=4,l=1;
        int sumit=arrs[ri]-arrs[l-1];
        System.out.println(sumit);
    }
}

//Problem 1 (Warm-up)
//
//Given:
//
//int arr[] = {2, 4, 6, 8, 10};
//
//Build the Prefix Sum array.
//
//Problem 2
//
//Using the Prefix Sum array, find the sum from:
//
//Index 1 to 3
//
//Do it without adding the numbers one by one.
//
//Problem 3
//
//Given:
//
//int arr[] = {5, 2, 7, 3, 6, 1};
//
//Answer these queries:
//
//Sum(0, 2)
//Sum(2, 5)
//Sum(1, 4)