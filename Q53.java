public Q53 {
    public static int maxSubArray(int[] nums) {
        int cur_sum = nums[0];
        int max_sum = nums[0];

        for(int i=1;i<nums.length;i++){
            cur_sum = Math.max(nums[i],cur_sum+nums[i]);
            max_sum = Math.max(max_sum,cur_sum);
        }

    return max_sum;
        
    }
    public static void main(String[] args){
        int nums [] ={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
    
