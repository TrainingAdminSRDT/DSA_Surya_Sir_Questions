import java.util.Arrays;

public class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Input:  " + Arrays.toString(nums1));
        int[] result1 = solver.runningSum(nums1);
        System.out.println("Output: " + Arrays.toString(result1)); 
        System.out.println("-------------------------");
        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Input:  " + Arrays.toString(nums2));
        int[] result2 = solver.runningSum(nums2);
        System.out.println("Output: " + Arrays.toString(result2)); 
    }
}