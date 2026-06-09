public class Main {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Main solver = new Main();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solver.maxSubArray(nums);
        System.out.println("Input Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]");
        System.out.println("Maximum Subarray Sum (Example 1): " + result); 
        System.out.println("Expected Output: 6");
    }
}