
//k radius subarray averages
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int []ans = new int[n];
        Arrays.fill(ans, -1);
         long s = 0;
         int size= 2*k +1;

            if(size > n){
                return ans;
            
            }
            for(int i = 0; i<size; i++){
                s += nums[i]; 
            }
            ans[k] = (int)(s/size);
            for(int i = size; i<n; i++){
                s = s + nums[i];
                s = s - nums[i- size];
                k++; 
                ans[k]  = (int)(s/size);
            }
            return ans;

        
        
    }
}

// LINEAR SEARCH

public class linear search {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }    
}


//MERGE SORT

public class merge_sort_array {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; k--) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i--];
                } else {
                    nums1[k] = nums2[j--];
                }
            }
        }
    }
}


//REMOVE ARRAY

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        int p = n - 1; 
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[p] = leftSquare;
                left++;
            } else {
                result[p] = rightSquare;
                right--;
            }
            p--;
        }
        
        return result;
    }
}