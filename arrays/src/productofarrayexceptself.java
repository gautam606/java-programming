import java.util.ArrayList;
import java.util.LinkedList;

public class productofarrayexceptself {
    public static void main(String[] args) {
        int []nums={2,3,1,4};
        int []arr=new int[nums.length];
        LinkedList<Integer>link=new LinkedList<>();
        for(int i=0;i< nums.length;i++)
        {
            int pr=1;
                for(int j=0;j< nums.length;j++)
            {
                if(i!=j)
                {
                    pr*=nums[j];
                }
            }
            link.add(pr);
        }
        int k=0;
        for(int v:link)
        {
            arr[k++]=v;
        }
        for(int l=0;l< arr.length;l++)
        {
            System.out.println(arr[l]);

        }
    }
}
