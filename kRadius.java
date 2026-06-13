class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        // Fill with -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        int windowSize = 2 * k + 1;

        if (windowSize > n) {
            return ans;
        }

        long sum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        ans[k] = (int)(sum / windowSize);

        // Slide window
        for (int i = windowSize; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - windowSize];

            int center = i - k;
            ans[center] = (int)(sum / windowSize);
        }

        return ans;
    }
}
