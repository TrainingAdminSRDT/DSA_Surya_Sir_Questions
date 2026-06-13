class MaxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int res=s;
        for(int i=k;i<nums.length;i++){
            s+=nums[i]-nums[i-k];
            res=Math.max(res,s);
        }
        return (res*1.0)/k;
    }
}