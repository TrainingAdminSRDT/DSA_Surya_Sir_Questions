class MoveZeroes {
    public void moveZeroes(int[] nums) {
              int[] temp = new int[nums.length];
        int k = 0;
        int j = nums.length - 1;
        for (int x : nums) {
            if (x != 0) {
                temp[k++] = x;
            } else {
                temp[j--] = x;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}