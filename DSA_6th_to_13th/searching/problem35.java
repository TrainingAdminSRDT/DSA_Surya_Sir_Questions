class problem35 {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        int i = 0 ;
        int j = nums.length -1;
        int mid = 0;
        int idx = 0;
        
        while ( j>=i){
            mid = (i+j)/2;
            idx= i;
            if ( nums[mid]==target){
            return mid;
            }
            else if ( target < nums[mid]){
                j = mid-1;
            }
            else  {
                i=mid+1;
            }
            }
            return i;
        }
        
    }
}