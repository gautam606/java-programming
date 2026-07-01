import java.util.Scanner;

public class p1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,4,7,2,67,12,64,59,25,56,12};
        System.out.println("enter the element to search");
        int s= sc.nextInt();
        boolean isfound=false;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==s)
            {
                System.out.println("element found at :"+i);
                isfound=true;
                break;

            }
        }
        if(!isfound)
        {
            System.out.println("element no found");
        }
        sc.close();
    }
}
