public class RevInt {
    public static void main(String[] args) {
        int x = 123;
        int reversed = reverse(x);
        System.out.println(reversed);
    }

    
    public static int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}

