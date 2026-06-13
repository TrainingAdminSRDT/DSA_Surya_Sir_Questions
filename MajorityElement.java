class MajorityElement {
    public int majorityElement(int[] nums) {
        int count=0;
        int maj=0;
        for(int x:nums){
            if(count==0){
                maj=x;
                count++;
            }
            else{
                if(maj==x){
                    count++;
                }
                else{
                    count--;
                }
            }
        }

   return maj; }
}