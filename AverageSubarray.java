import java.util.Arrays;
public class AverageSubarray {
    public static void main(String[] args) {
        MaxAverageSolution solution = new MaxAverageSolution();
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Test Case 1 Output: " + solution.findMaxAverage(nums1, k1)); 
        int[] nums2 = {5};
        int k2 = 1;
        System.out.println("Test Case 2 Output: " + solution.findMaxAverage(nums2, k2)); 
    }
}
class MaxAverageSolution {
    public double findMaxAverage(int[] nums, int k) {
        // Pehle k elements ka sum nikalenge
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return (double) maxSum / k;
    }
}