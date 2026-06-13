public class Solution2090 {
    public static void main(String[] args) {
        int[] n = {7,4,3,9,1,8,5,2,6};
        int[] r = getAverages(n, 3);
        for (int v : r) System.out.print(v + " ");
    }
    public static int[] getAverages(int[] n, int k) {
        int[] a = new int[n.length];
        java.util.Arrays.fill(a, -1);
        int d = 2 * k + 1;
        if (n.length < d) return a;
        long s = 0;
        for (int i = 0; i < d; i++) s += n[i];
        a[k] = (int)(s / d);
        for (int i = k + 1; i + k < n.length; i++) {
            s += n[i + k] - n[i - k - 1];
            a[i] = (int)(s / d);
        }
        return a;
    }
}
