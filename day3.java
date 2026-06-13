
//maximum subarray
class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentSum = nums[0];//1st element of array
        int maxSum =  nums[0];

        for(int i=1; i<nums.length; i++){
         currentSum = Math.max(nums[i] , currentSum + nums[i]);

         maxSum =  Math.max(maxSum , currentSum);
        }
        return maxSum;

    }
}
//moves zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] !=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            
        }  
       

    } 
}

//running sum of 1d array
class Solution {
    public int[] runningSum(int[] nums) {
      
        for(int i = 1; i<nums.length; i++){
           nums[i] = nums[i - 1] + nums[i];
        } 
        return nums;
        
    }
}


//Maximum average subarray I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //sum=55
        int s = 0;
        for(int i = 0; i<k; i++){
            s += nums[i];
        }
        //sliding window
    
    int ans = s; 
        for(int i = k; i<nums.length; ++i){
           s +=(nums[i] - nums[i-k]);
           ans = Math.max(ans , s);
        }
       
        return ans * 1.0/k;

            

        
        
    }
}