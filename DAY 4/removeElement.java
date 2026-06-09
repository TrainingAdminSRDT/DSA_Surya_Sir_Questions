import java.util.Arrays;

class Solution {
    // LeetCode ka main logic function
    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++; 
            }
        }
        return k; 
    }
    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Value to remove: " + val);
        int k = solver.removeElement(nums, val);
        System.out.println("\n--- Result ---");
        System.out.println("New length (k): " + k);
        System.out.print("Modified Array (first " + k + " elements): [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}