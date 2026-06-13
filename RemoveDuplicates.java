class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
        int k=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==nums[k]){
                i++;
            }
            else{
                k++;
                swap(nums,i,k);
                i++;
            }
        }
        return k+1;

    }
    public  void swap(int[] arr ,int i,int k){
        int temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
    }

}




// int s=0;
//         for(int i=0;i<k;i++){
//             s+=nums[i];
//         }
//         int ans=s;
//         for(int i=k;i<nums.length;++i){
//             s+=(nums[i]-nums[i-k]);
//             ans=Math.max(ans,s);
//         }
//         return ans*1.0/k;