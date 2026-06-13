class Solution {
    public int[] sortedSquares(int[] nums) {


        // method 1 
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }  

        // Arrays.sort(nums);

        // method 2 ;

        int i = 0 ; 
        int j = nums.length - 1 ;
        int k = nums.length - 1 ;
        int[] ans = new int[nums.length];
        while(i <= j){
            if(nums[i] >= nums[j]){
                ans[k] = nums[i];
                i++;
            }else if(nums[i] < nums[j]){
                ans[k] = nums[j];
                j--;
            }
            k--;
        }
        return ans ;
    }
}