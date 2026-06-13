import java.util.Arrays;
import java.util.Scanner; 
public class isAnagram {
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Anagram Checker ---");
        System.out.print("Enter the first word: ");
        String s = sc.next();
        System.out.print("Enter the second word: ");
        String t = sc.next();
        if (checkAnagram(s, t)) {
            System.out.println("Result: Yes, they are Anagrams! (TRUE)");
        } else {
            System.out.println("Result: No, they are not Anagrams! (FALSE)");
        }
        sc.close();
    }
}