public class Solution912 {
    public static void main(String[] args) {
        int[] a = {5,2,3,1};
        int[] r = sortArray(a);
        for (int x : r) System.out.print(x + " ");
    }
    public static int[] sortArray(int[] nums) {
        java.util.Arrays.sort(nums);
        return nums;
    }
}
