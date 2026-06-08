class Solution {
    public int maxSubArray(int[] nums) {
        //Using Kadane's Algorithm
        int j = 0 ;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (j < nums.length){
            currSum += nums[j];

            if (currSum > maxSum){
                maxSum = currSum;
            }
            if (currSum < 0){
                currSum = 0;
            }
            //System.out.println("currSum =" + currSum + "maxSum =" + maxSum + "j =" + j);
            j++;
        }
        return maxSum;
    }
}
