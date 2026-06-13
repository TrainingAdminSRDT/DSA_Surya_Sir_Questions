public class MajElement {
    public int majorityElement(int[] nums) {
        int c = 0, m = 0; //m-> majority , c-> count , nums[] is array, i-> int
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) m = nums[i];
            if (nums[i] == m) c++;
            else c--;
        }
        return m;
    }
}
