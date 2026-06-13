class Q2090 {

    // function
    public static int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        // fill with -1
        for(int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        int windowSize = 2 * k + 1;

        // if window not possible
        if(windowSize > n) {
            return ans;
        }

        long sum = 0;

        // first window sum
        for(int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        // first average
        ans[k] = (int)(sum / windowSize);

        int left = 0;

        // sliding window
        for(int right = windowSize; right < n; right++) {

            sum = sum - nums[left];
            left++;

            sum = sum + nums[right];

            ans[left + k] = (int)(sum / windowSize);
        }

        return ans;
    }

    // main function
    public static void main(String[] args) {

        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;

        int[] result = getAverages(nums, k);

        // print array
        for(int x : result) {
            System.out.print(x + " ");
        }
    }
}