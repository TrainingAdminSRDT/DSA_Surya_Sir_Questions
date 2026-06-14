class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,m=0;
        for(int x: nums){
            if (cnt==0){
                m=x;
                cnt=cnt+1;
            }
            else{
                if(m==x){
                    cnt=cnt+1;
                }
                else{
                    cnt=cnt-1;
                }
            }
        }
   return m; }
}