import java.util.Arrays;
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        Arrays.fill(avgs, -1);
        int windowSize = 2 * k + 1;
        if (n < windowSize) {
            return avgs;
        }
        long windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }
        avgs[k] = (int) (windowSum / windowSize);
        for (int i = windowSize; i < n; i++) {
            windowSum += nums[i] - nums[i - windowSize];
            avgs[i - k] = (int) (windowSum / windowSize);
        }
        
        return avgs;
    }
    public static void main(String[] args) {
        Solution solver = new Solution();
        // Example 1 ka input
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        // Function call
        int[] result = solver.getAverages(nums, k);
        // Output ko print karne ke liye
        System.out.println("Output: " + Arrays.toString(result));
    }
}