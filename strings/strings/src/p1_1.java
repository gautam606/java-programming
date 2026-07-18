public class p1_1 {
    public static void main(String[] args) {
        int count=0;
        String s="education is the must ";
        String str=s.toLowerCase().trim();
        for(char c:str.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
//count the vowels
//Input: "education"
//
//Output: 5
