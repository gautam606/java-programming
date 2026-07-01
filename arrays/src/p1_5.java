public class p1_5 {
    public static void main(String[] args) {
        int arr[]={3,4,7,2,67,12,64,59,25,56,12};
        int evenc=0,oddc=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evenc++;
            }
            else {
                oddc++;
            }
        }
        System.out.println(evenc+" even count");
        System.out.println(oddc+" odd count");
    }
}
