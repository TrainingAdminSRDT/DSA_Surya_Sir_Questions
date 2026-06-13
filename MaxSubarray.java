class Solution {
    public int maxSubArray(int[] nums) {
        

        int sum = 0;
        int best=nums[0];

        for(int x : nums ){
            sum+=x;
            best=Math.max(best,sum);
            if(sum<0)
                sum=0;
        }
        return best;
    }
}