public class p_15 {
    public static void main(String[] args) {
        // Example inputs
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        lengthOfLastWord(s1);
        lengthOfLastWord(s2);
        lengthOfLastWord(s3);
    }

    public static void lengthOfLastWord(String s) {

        s = s.trim();


        int lastSpace = s.lastIndexOf(' ');


        int length = s.length() - lastSpace - 1;

        System.out.println(length);
    }
}
