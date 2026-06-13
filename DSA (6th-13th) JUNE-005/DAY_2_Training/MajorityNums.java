public class MajorityNums {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int c = 0, m = 0; //m-> majority , c-> count , nums[] is array, i-> int
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) m = nums[i];
            if (nums[i] == m) c++;
            else c--;
        }
        System.out.println(m);
    }
}
