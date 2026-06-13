record Vue(int value,int index){}




class Solution {

    


    public int findUnsortedSubarray(int[] nums) {

     Stack<Vue> stck  = new Stack<>();
     int left=nums.length;

     stck.push( new Vue(nums[0],0) );

     for(int i=1; i<nums.length; i++){
        if(stck.size()>0){
            if(stck.peek().value()<=nums[i]){
                stck.push(new Vue(nums[i],i));
            }else{
                int oldIndex=stck.peek().index();
                stck.pop();
                while(stck.size()>0 && stck.peek().value()>nums[i]){
                    oldIndex=stck.peek().index();
                    stck.pop();
                }
                stck.push(new Vue(nums[i],oldIndex));
                left=Math.min(left,oldIndex);
            }
        }
     }







     stck  = new Stack<>();
     int right=0;
    int n= nums.length-1;
     stck.push( new Vue(nums[n],n) );

     for(int i=n-1; i>=0; i--){
        if(stck.size()>0){
            if(stck.peek().value()>=nums[i]){
                stck.push(new Vue(nums[i],i));
            }else{
                int oldIndex=stck.peek().index();
                stck.pop();
                while(stck.size()>0 && stck.peek().value()<nums[i]){
                    oldIndex=stck.peek().index();
                    stck.pop();
                }
                stck.push(new Vue(nums[i],oldIndex));
                right=Math.max(right,oldIndex);
            }
        }
     }

     return left<right ? right-left+1 : 0;


    }
}