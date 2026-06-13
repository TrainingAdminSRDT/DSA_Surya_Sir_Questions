class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sm=0;
        int i=0,j=0;


      while(j<k){
        sm=sm+nums[j];
        j++;
      
      }

      int maxS=sm;
      while(j<nums.length){
        sm=sm+nums[j]-nums[i];
        i++;
        j++;

        maxS=Math.max(maxS,sm);

      }

      return (double)maxS/k;
    }
}