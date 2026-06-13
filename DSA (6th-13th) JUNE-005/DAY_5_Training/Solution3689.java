public class Solution3689 {
    public static void main(String[] args) {
        int[] n = {1,3,2};
        System.out.println(maxTotalValue(n, 2));
    }
    public static int maxTotalValue(int[] n, int k) {
        int mx = n[0], mn = n[0];
        for (int v : n) { if (v > mx) mx = v; if (v < mn) mn = v; }
        return (mx - mn) * k;
    }
}
