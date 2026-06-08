class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1){
            return;
        }
        if (nums.length == 2){
            if (nums[0] != 0) return;
        }
        int i = 0;
        while (i < nums.length){
            if (nums[i] == 0) break;
            i++;
        }
        int j = i + 1;
        while (j < nums.length){
            if (nums[j] != 0) break;
            j++;
        }
        while (j < nums.length){
            
            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;

            while (j < nums.length && nums[j] == 0){
                j++;
            }
            
        }
        return;
    }
}
