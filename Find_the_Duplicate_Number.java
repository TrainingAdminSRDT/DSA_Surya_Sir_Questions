import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                return nums[i];
            } else {
                hash.put(nums[i], 1);
            }
        }

        return -1;
    }
}
