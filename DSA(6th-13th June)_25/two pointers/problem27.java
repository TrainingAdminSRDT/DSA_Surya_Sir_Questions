public class problem27 {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int k = 0;
        
     for ( int i = 0 ; i < nums.length ; i++){
        if ( nums[i] != val){
            nums[k] = nums[i];
            k++;
        }
       
     }   
     return k;
    }
} 

//  2 pointer 
