import java.util.Scanner;
public class lengthOfLastWord {
    public static int getLengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence/string:");
        String input = scanner.nextLine();
        int result = getLengthOfLastWord(input);
        System.out.println("Length of the last word is: " + result);
        scanner.close();
    }
}