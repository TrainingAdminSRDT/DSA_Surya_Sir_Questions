package Day1.day2;

class Array {
    public static void main(String[] args) {
        int nums[]={5,9,75,13,2,58};
        int s,l;
        if(nums[0]<nums[1]){
            s=nums[0];
            l=nums[1];
        }
        else{
            s=nums[1];
            l=nums[0];
        }
        for(int i=2;i<nums.length;i++){
            if(l<=nums[i]){
                l=nums[i];
            }
            else{
                if(nums[i]<=s){
                    s=nums[i];
                }
            }

        }
        System.out.println(l);
        System.out.println(s);
    }
    
}