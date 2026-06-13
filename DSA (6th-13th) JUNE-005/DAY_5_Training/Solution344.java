public class Solution344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(java.util.Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) { char t = s[i]; s[i] = s[j]; s[j] = t; i++; j--; }
    }
}
