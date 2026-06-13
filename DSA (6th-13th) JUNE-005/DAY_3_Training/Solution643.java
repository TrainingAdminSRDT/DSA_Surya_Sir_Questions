public class Solution643 {
    public static void main(String[] args) {
        int[] n = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(n, 4));
    }
    public static double findMaxAverage(int[] n, int k) {
        int s = 0;
        for (int i = 0; i < k; i++) s += n[i];
        int m = s;
        for (int i = k; i < n.length; i++) { s += n[i] - n[i - k]; if (s > m) m = s; }
        return (double) m / k;
    }
}
