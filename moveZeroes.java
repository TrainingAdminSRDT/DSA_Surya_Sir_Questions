import java.util.Arrays;
class MoveZeroesSolution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
    public static void main(String[] args) {
        MoveZeroesSolution sol = new MoveZeroesSolution();
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original Array: " + Arrays.toString(nums));
        sol.moveZeroes(nums);
        System.out.println("Modified Array: " + Arrays.toString(nums)); 
    }
}