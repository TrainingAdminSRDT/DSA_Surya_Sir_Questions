public class S704 {
    class Solution {
    public int search(int[] nums, int target) {

        // Start pointer
        int left = 0;

        // End pointer
        int right = nums.length - 1;

        // Keep searching while range is valid
        while (left <= right) {

            // Find middle index
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Target is on the right side
            if (nums[mid] < target) {
                left = mid + 1;
            }

            // Target is on the left side
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}
    
}
