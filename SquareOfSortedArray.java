class Solution {
    public int[] sortedSquares(int[] nums) {
       
       int [] ans = new int[nums.length];

       int minIndex=0;
       int i=0;
       while(minIndex+1<nums.length && ( Math.abs(nums[minIndex]) >= (Math.abs(nums[minIndex+1])) ) ){
        minIndex+=1;
       }
        int x=minIndex-1,y=minIndex;
        int cnt=0;
        while(cnt<nums.length){
            if(x>=0 && y<nums.length){
                    if(Math.abs(nums[x])<Math.abs(nums[y])){
                        ans[cnt]=nums[x]*nums[x--];
                    }else{
                        ans[cnt]=nums[y]*nums[y++];
                    }
            }else if(x<0){
                ans[cnt]=nums[y]*nums[y++];
            }
            else {
                ans[cnt]=nums[x]*nums[x--];
            }
            cnt++;
        }

        return ans;


    }
}