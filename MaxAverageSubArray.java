class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        int sm=0;
        
        double maxAvg=0;
        
        while(j<k)
            sm+=nums[j++];
        maxAvg=(double)sm/k;

        while(j<nums.length){
            sm=sm-nums[i]+nums[j];
            maxAvg=Math.max(maxAvg,(double)sm/k);
            i++;
            j++;

        }

     return maxAvg;   
    }
}