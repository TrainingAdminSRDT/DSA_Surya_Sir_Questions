class Solution {
     public void moveZeroes(int[] nums) {
        int ZeroSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                ZeroSize++; 
            }
            else if (ZeroSize > 0) {
	            int temp = nums[i];
	            nums[i]=0;
	            nums[i-ZeroSize]=temp;
            }
        }
    }
}
