class Solution {
    public int[] getAverages(int[] nums, int k) {
       int [] ans= new int [nums.length];

       for(int i=0;i<nums.length;i++){
        ans[i]=-1;
       }

       int x=0,y=k,z=0;

       long sm=0;
       while(z<(2*k)&& z<nums.length){
        sm=sm+nums[z];
        z++;
       }

       while(z<nums.length){
        sm=sm+nums[z];
        ans[y]=(int)(sm/(2*k+1));
        sm=sm-nums[x];
        x++;
        y++;
        z++;

       }

       return ans;
    }
}