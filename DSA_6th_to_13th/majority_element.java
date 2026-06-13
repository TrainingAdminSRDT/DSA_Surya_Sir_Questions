class majority_element {
    public int majorityElement(int[] nums) {
        int majority = 0 , count = 0;

        for( int i : nums){
            if ( count == 0){  //phele count ki value 0 hai isliye ==0 kiya 
                majority = i ;
                count++;
            }
            else{
                if ( i == majority ){
                    count++;
                } 
                else{
                    count--;
                }
            }
        }
        return majority ;
    }
}