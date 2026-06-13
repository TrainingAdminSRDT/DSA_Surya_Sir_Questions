public class Solution56 {
    public static void main(String[] args) {
        int[][] in = {{1,3},{2,6},{8,10},{15,18}};
        int[][] out = merge(in);
        for (int[] a : out) System.out.println(a[0]+","+a[1]);
    }
    public static int[][] merge(int[][] intervals) {
        java.util.Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        java.util.List<int[]> res = new java.util.ArrayList<>();
        for (int[] i : intervals) {
            if (res.isEmpty() || res.get(res.size()-1)[1] < i[0]) res.add(i);
            else res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], i[1]);
        }
        return res.toArray(new int[0][]);
    }
}
