class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n;i++) {
            ans[i] = -1;
        }
        int len = 2*k+1;
        if(len>n) {
            return ans;
        }
        long sum = 0;
        for(int i = 0; i<len; i++){
            sum += nums[i];
        }
        ans[k] = (int)(sum / len);
        for(int i = len;i<n;i++){
            sum = sum + nums[i];
            sum = sum - nums[i - len];
            int center = i-k;
            ans[center]=(int)(sum / len);
        }
        return ans;  
        
    }
}