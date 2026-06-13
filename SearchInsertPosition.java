class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start=0,end=nums.length-1;
        
        if(target<=nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;

        while(end-start>1){
            int mid=(start+end)/2;
            if(target==nums[mid])
                return mid;
            if(target>nums[mid])
                start=mid;
            else
                end=mid;
        }

        return end;
    }
}