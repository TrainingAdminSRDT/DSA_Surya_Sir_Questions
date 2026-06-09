class Solution {
    public int[] getAverages(int[] nums, int k) {
        //Check constraints for overflow
        //Here, we have taken prefix and suffix arrays as "long" to prevent overflow
        int n = nums.length;
        int ans[] = new int[n];

        long prefix[] = findPrefix(nums);
        long suffix[] = findSuffix(nums);

        for (int i = 0 ; i < n ; i++){
            if (i < k){
                ans[i] = -1;
            }
            else {
                int lIdx = Math.abs(i - k);
                int rIdx = Math.abs(i + k);
                if (lIdx >= 0 && rIdx < n){ //Check if in range
                    long beforeSum = Math.abs(prefix[i] - prefix[lIdx]);
                    long afterSum = Math.abs(suffix[i] - suffix[rIdx]);
                    long avg = (beforeSum + nums[i] + afterSum)/(2 * k + 1);
                    ans[i] = (int)avg;
                }
                else { //Not in range
                    ans[i] = -1;
                }
            }
        }
        return ans;
    }
    public static long[] findPrefix(int nums[]){
        int n = nums.length;
        long prefix[] = new long[n];
        prefix[0] = 0;
        for (int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        return prefix;
    }
    public static long[] findSuffix(int nums[]){
        int n = nums.length;
        long suffix[] = new long[n];
        suffix[n-1] = 0;
        for (int i = n-2 ; i >= 0 ; i--){
            suffix[i] = suffix[i+1] + nums[i+1];
        }
        return suffix;
    }
}
