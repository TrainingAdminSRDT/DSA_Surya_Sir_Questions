public class Solution2574 {
    public static void main(String[] args) {
        int[] n = {10,4,8,3};
        int[] r = leftRigthDifference(n);
        for (int v : r) System.out.print(v + " ");
    }
    public static int[] leftRigthDifference(int[] n) {
        int t = 0, l = 0;
        for (int v : n) t += v;
        int[] a = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            int r = t - l - n[i];
            a[i] = Math.abs(l - r);
            l += n[i];
        }
        return a;
    }
}
