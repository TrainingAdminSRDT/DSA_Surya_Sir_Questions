public class Solution27 {
    public static void main(String[] args) {
        int[] n = {3,2,2,3};
        int k = removeElement(n, 3);
        for (int i = 0; i < k; i++) System.out.print(n[i] + " ");
    }
    public static int removeElement(int[] n, int v) {
        int i = 0;
        for (int x : n) if (x != v) n[i++] = x;
        return i;
    }
}
