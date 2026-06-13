public class Solution704 {
    public static void main(String[] args) {
        int[] n = {-1,0,3,5,9,12};
        System.out.println(search(n, 9));
    }
    public static int search(int[] n, int t) {
        int l = 0, r = n.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (n[m] == t) return m;
            if (n[m] < t) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
