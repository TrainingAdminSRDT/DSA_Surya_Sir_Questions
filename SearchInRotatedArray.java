class Solution {
    
    public int binarySearch(int nums[],int target){
        
        int left=0,right=nums.length-1;
        int mid=0;

        while(left<right){
            mid=left+(right-left)/2;

            System.out.println(left+"  "+mid+"  "+right);

            if(nums[mid] ==  target)
                return mid;

            if(nums[left]>nums[right]){
                //Element in first part
                if(nums[mid]>=nums[left]){
                    if(target<=nums[right])
                        left=mid+1;
                    else if(target<nums[mid])
                        right=mid-1;
                    else
                        left=mid+1;
                }   
                //Element in second part
                else{
                    if(target>=nums[left])
                        right=mid-1;
                    else if(target>nums[mid])
                        left=mid+1;
                    else
                        right=mid-1;

                }
            }else{
                if(target<nums[mid])
                    right=mid-1;
                else 
                    left=mid+1;
            }
 
        }
        System.out.println(left+"  "+mid+"  "+right);
        return (nums[left]==target)?left:-1;
    }


    public int search(int[] nums, int target) {
        return binarySearch(nums,target);
    }
}