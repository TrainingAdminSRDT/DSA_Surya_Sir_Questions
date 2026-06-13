public class Solution53 {
    public static void main(String[] args) {
        int[] n = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(n));
    }
    public static int maxSubArray(int[] n) {
        int s = 0, m = Integer.MIN_VALUE;
        for (int v : n) { s += v; if (s > m) m = s; if (s < 0) s = 0; }
        return m;
    }
}
