//program 1
/*import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (i >= 2 * k) {

                ans[i - k] = (int)(sum / (2 * k + 1));

                sum -= nums[i - 2 * k];
            }
        }

        return ans;
    }
}/* */

//program 2
/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

//program 3
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}/* */

//program 4
    /*class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0, j = n - 1, k = n - 1;

        while (i <= j) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if (a > b) {
                ans[k] = a;
                i++;
            } else {
                ans[k] = b;
                j--;
            }
            k--;
        }

        return ans;
    }
}/* */
    
