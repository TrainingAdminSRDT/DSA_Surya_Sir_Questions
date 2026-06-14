import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervals{
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]) );
        List<int[]> list = new ArrayList<>();

        int st = intervals[0][0];
        int ed = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= ed) {
           
                ed = Math.max(ed, intervals[i][1]);
            } 
            else {
                list.add(new int[]{st, ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }

      
        list.add(new int[]{st, ed});

        return list.toArray(new int[list.size()][]);
    } 
}
