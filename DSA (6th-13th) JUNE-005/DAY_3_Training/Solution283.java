public class Solution283 {
    public static void main(String[] args) {
        int[] n = {0,1,0,3,12};
        moveZeroes(n);
        for (int v : n) System.out.print(v + " ");
    }
    public static void moveZeroes(int[] n) {
        int i = 0;
        for (int v : n) if (v != 0) n[i++] = v;
        while (i < n.length) n[i++] = 0;
    }
}
