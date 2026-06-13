import java.util.Arrays;
public class reverseString {
    public void reverseStringMethod(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        reverseString solver = new reverseString();
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original 1: " + Arrays.toString(s1));
        solver.reverseStringMethod(s1);
        System.out.println("Reversed 1: " + Arrays.toString(s1));
        System.out.println("---------------------------------");
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Original 2: " + Arrays.toString(s2));
        
        solver.reverseStringMethod(s2);
        System.out.println("Reversed 2: " + Arrays.toString(s2));
    }
}