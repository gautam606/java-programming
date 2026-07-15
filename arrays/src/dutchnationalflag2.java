public class dutchnationalflag2 {
    public static void main(String[] args) {
       int[]arr= {2,0,1,2,1,0};
       int nums[]=new int[arr.length];
       int one=0,zero=0,two=0;
       for(int ele:arr)
       {
           if(ele==0)
           {
               zero++;
           }
           else if(ele==1)
           {
               one++;
           }
           else {
               two++;
           }
       }
       int k=0;
       while(zero>0)
       {
           nums[k++]=0;
           zero--;
       }
      while(one>0)
      {
          nums[k++]=1;
          one--;
      }
      while(two>0)
      {
          nums[k++]=2;
          two--;
      }
       for(int j=0;j<nums.length;j++)
       {
           System.out.print(" "+nums[j]);
       }

    }
}
