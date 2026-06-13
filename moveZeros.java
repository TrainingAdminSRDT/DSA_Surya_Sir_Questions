class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Place all non-zero elements at the front
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}