// K RADIOUR SUB ARRAY

public class K_Radious_subarray {
    public int[] getAverages(int[] nums, int k) {
        int a=0;
        long sum = 0;
        int l=nums.length;
        int []ans=new int[l];
        int size = 2*k+1;
        // Arrays.fill(ans,-1);

        if (l < size) {
            return ans;
        }

        for (int i = 0; i<size ; i++){
            sum+=nums[i];
            
        }
        ans[k] = (int) (sum/size);

        for (int i = size; i < l; i++) {
            sum += nums[i] - nums[i - size];
            
            ans[i - k] = (int) (sum / size);
        }
        return ans;
    }
}

// MAX AVG SUB ARRAY

public class MaxAvg_Subarray {
     public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0) return 0;

        int s=0;
        for (int i=0;i<k;i++){
            s+=nums[i];
        }

        int ans = s;
        for(int i=k;i<nums.length;i++){
            s+=(nums[i]-nums[i-k]);
            ans=Math.max(ans,s);
        }
        return ans * 1.0/k;
    }
}


// MAX SUBARRAY

public class maxSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        
        int cursum = nums[0]; 
        int maxsum =nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            cursum=Math.max(nums[i],cursum+nums[i]);
            maxsum=Math.max(maxsum,cursum);
        }
      
        return maxsum;
    }
}


//MOVE ZEROES

public class moveZero {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int last=nums.length;
        for(int i=0;i<last;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        
    }
}
}


//RUNNING SUM OF 1D ARRAY


public class Running_Sum_of_1D_Array {
    public int[] runningSum(int[] nums) {
        int csum=0;
        for(int i=0;i<nums.length;i++){
            csum += nums[i];
            nums[i]=csum;
        }
        return nums;
    }
}
