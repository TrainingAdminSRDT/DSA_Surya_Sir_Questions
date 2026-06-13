void moveZeroes(int* nums, int numsSize) 
{
 int i, j = 0, temp;
 for(i = 0; i<numsSize; i++)
 {
    if(nums[i]!= 0)
    {
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        j++;
    }
 }   
    
}