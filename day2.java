
//Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int temp = 0; 
        int m = 0 ; 
       
        for( int i : nums){
             if( temp == 0){
                m = i;
                temp ++;

             }
             else{
                if(m == i){
                    temp = temp + 1;

                }
                else{
                    temp = temp - 1;
                }
             }
        
        }
        return m; 
        
    }
}


//remove duplicates
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

//two sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
   
//reverse string
class Solution {
    public void reverseString(char[] s) {
       

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
        
       
        




