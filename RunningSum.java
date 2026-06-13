class Solution {
    public int[] runningSum(int[] nums) {
        
        int [] sm=new int[nums.length];
        sm[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sm[i]=sm[i-1]+nums[i];
        }

        return sm;
    }
}