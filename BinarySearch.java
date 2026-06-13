public class BinarySearch {
   
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        
        while(l<r){
            int m=(l+r)>>1;
            if(nums[m]>=target) r= m;
            
            else{
                l=m+1;
            }
        }
        return nums[l]==target?l:-1 ;
    }
}

