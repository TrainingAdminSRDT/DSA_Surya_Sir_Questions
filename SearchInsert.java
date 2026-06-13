import java.util.Scanner;
import java.util.Arrays;
public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5; 
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        int result = searchInsert(nums, target);
        System.out.println("Result Index: " + result);
    }
}