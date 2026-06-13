import java.util.Scanner;
public class ValidSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 2;
        long right = num / 2; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long guessSq = mid * mid;

            if (guessSq == num) {
                return true;
            } else if (guessSq > num) {
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square. -> true");
        } else {
            System.out.println(num + " is not a perfect square. -> false");
        }
        scanner.close();
    }
}