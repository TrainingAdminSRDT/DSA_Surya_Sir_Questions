class Solution {
    public int[][] merge(int[][] intervals) {
        
       
       Arrays.sort( intervals,(i1,i2) -> {
        if(i1[0]!= i2[0])
            return i1[0]-i2[0];
        return i1[1]-i2[1];
       } );


       ArrayList<int[]> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end   = intervals[0][1];
        int i = 1;

        while(i<intervals.length){
            int interval[] = intervals[i];
            
            if(interval[0]<=end ){
                end = Math.max(end,interval[1]);
            }
            else{
                ans.add( new int[]{start,end} );
                start=interval[0];
                end=interval[1];
            }
            i++;
       }

       ans.add( new int[]{start,end} );

       return ans.toArray(new int[0][]);

    }
}