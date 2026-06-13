public class problem977 {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int ans[] = new int[nums.length];
        int j = nums.length-1;
        for ( int k = nums.length-1 ; k >= 0 ; k--){
            if ( nums[i]*nums[i] > nums[j]*nums[j] ){
                ans[k] = nums[i]*nums[i];
                i++;
            }
            else{
                ans[k] = nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}

