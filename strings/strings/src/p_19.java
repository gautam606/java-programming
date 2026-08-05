public class p_19 {
    public static void main(String[] args) {
        String s="USA";
        boolean iscapital=false;
        String text=s.toUpperCase();
        if(s.equals(text))
        {
            iscapital=true;
        }
        System.out.println(iscapital);
    }
}
//Input:
//        "USA"
//
//Output:
//        true