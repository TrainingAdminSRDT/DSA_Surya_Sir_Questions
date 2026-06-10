//program 1
/*class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t result = 0;

        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }

        return result;
    }
};/* */

//program 2
/*class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}/* */

//program 3
/*class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}/* */

//program 4
/*class Solution {
    public int[] runningSum(int[] nums) {
        for (int i=1 ; i< nums.length; i++){
            nums[i]= nums[i]+nums[i-1];
        }
        return nums;
    }
}/* */

//program 5
/*class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}/* */
