class Solution {
    public int[] getAverages(int[] nums, int k) {
    
    int n=nums.length;
    int [] ans = new int[n];
  

    for(int i=0;i<n;i++)
        ans[i]=-1;

    long tSum=0;
    int x=0,y=k,z=0;
    while(z<n && z<(2*k)){
        tSum+=nums[z];
        z++;
    }       

    while(z<n){
        tSum+=nums[z];
        ans[y]=(int)(tSum/(2*k+1));
        tSum=tSum-nums[x];
        x++;y++;z++;
    } 


    return ans;
   }
}