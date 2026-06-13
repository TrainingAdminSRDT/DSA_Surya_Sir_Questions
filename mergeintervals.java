import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] ans = new int[intervals.length][2];
        int index = 0;

        ans[index][0] = intervals[0][0];
        ans[index][1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlapping intervals
            if (intervals[i][0] <= ans[index][1]) {
                ans[index][1] = Math.max(ans[index][1], intervals[i][1]);
            }
            // Non-overlapping interval
            else {
                index++;
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(ans, index + 1);
    }
}
