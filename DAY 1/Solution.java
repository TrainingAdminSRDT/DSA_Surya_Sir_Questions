import java.util.Scanner;

public class Solution {
    
    // LeetCode wala function jo aapne likha hai
    public int addDigits(int num) {
        while (num >= 10) {
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
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Koi bhi number enter karein: ");
        int num = sc.nextInt();
        
        // Function call aur result print
        int result = sol.addDigits(num);
        System.out.println("Result (Single digit sum): " + result);
        
        sc.close();
    }
}