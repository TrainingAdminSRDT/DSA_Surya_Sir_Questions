class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int max=0;
        for(int x: nums){
            if(cnt==0){
                max=x;
                cnt=cnt+1;
            }
            else{
                if(max==x){
                    cnt=cnt+1;
                }
                else{
                    cnt=cnt-1;
                }
            }
        }
        return max;
    }
}
