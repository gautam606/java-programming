public class reversenum {
    public static void main(String[] args) {

        int num = 1234, reversed = 0;

        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digits = num % 10;
            reversed = reversed * 10 + digits;
            num = num / 10;
        }
        System.out.println(reversed);
    }
}
