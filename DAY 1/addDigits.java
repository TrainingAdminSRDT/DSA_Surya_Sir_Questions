import java.util.Scanner;

public class addDigits {
    public static int addDigits(int num) {
        while (num >= 10) { // Repeat until single digit
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Output: " + addDigits(num));

        sc.close();
    }
}