int removeDuplicates(int* nums, int numsSize)
{
    int i, j;

    if(numsSize == 0)
        return 0;

    j = 0;

    for(i = 1; i < numsSize; i++)
    {
        if(nums[i]!= nums[j])
        {
            j++;
            nums[j] = nums[i];
        }
    } 

    return j + 1;   
}