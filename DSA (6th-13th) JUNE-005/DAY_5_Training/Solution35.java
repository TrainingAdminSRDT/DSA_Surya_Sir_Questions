public class Solution35 {
    public static void main(String[] args) {
        int[] n = {1,3,5,6};
        System.out.println(searchInsert(n, 5));
    }
    public static int searchInsert(int[] n, int t) {
        int l = 0, r = n.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (n[m] < t) l = m + 1;
            else r = m;
        }
        return l;
    }
}
