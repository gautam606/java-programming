public class p1_8 {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAG";

        boolean isRotate = false;

        if (s1.length() == s2.length()) {
            String doubled = s1 + s1;
            if (doubled.contains(s2)) {
                isRotate = true;
            }
        }

        System.out.println(isRotate);
    }
}

//Input:
//s1 = "ABCD"
//s2 = "CDAB"
//
//Output:
//True

//Input:
//s1 = "hello"
//s2 = "world"
//
//Output:
//False