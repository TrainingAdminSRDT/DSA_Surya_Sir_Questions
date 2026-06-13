import java.util.Arrays;
 class Solution  {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1; 

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = sol.sortedSquares(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(result1) + "\n");
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = sol.sortedSquares(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + Arrays.toString(result2));
    }
}