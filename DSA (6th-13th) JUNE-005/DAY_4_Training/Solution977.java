public class Solution977 {
    public static void main(String[] args) {
        int[] n = {-4,-1,0,3,10};
        int[] r = sortedSquares(n);
        for (int v : r) System.out.print(v + " ");
    }
    public static int[] sortedSquares(int[] n) {
        int i = 0, j = n.length - 1, k = j;
        int[] a = new int[n.length];
        while (i <= j) {
            if (Math.abs(n[i]) > Math.abs(n[j])) a[k--] = n[i] * n[i++];
            else a[k--] = n[j] * n[j--];
        }
        return a;
    }
}
