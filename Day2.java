// 169  Majority Element


class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
       int candidate=0;
        
        for(int num: nums){
            if(count==0){
                candidate=num;
            }
            
            if
                (num==candidate){
                    count++;
            }
             else{
                    count--;
             } 
        }
        return candidate;    
                
    } 
}


//26  Remove Duplicates from Sorted Array


class Solution {
    public int removeDuplicates(int[] arr) {
        if(arr.length==0){
            return 0;
        }
    int k=1;
      for(int i=1; i<arr.length; i++){
        if(arr[i]!=arr[k-1]){
            arr[k]=arr[i];
            k++;
        }
        
      }
      return k;
    }
    
}


// 53  Maximum Subarray 


class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}




    

        
        
    
