public class Solution1480 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4};
        int[] r = runningSum(n);
        for (int v : r) System.out.print(v + " ");
    }
    public static int[] runningSum(int[] n) {
        for (int i = 1; i < n.length; i++) n[i] += n[i - 1];
        return n;
    }
}
