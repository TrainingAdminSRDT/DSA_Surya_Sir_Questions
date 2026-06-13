//Reversse integer 
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!= 0){

     
           int rem= x%10;

            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
              return 0;   
            }
           rev = rev * 10 + rem;
          x = x / 10;//apend
           }
          
        return rev;

        
    }
}


//add digit 
class Solution {
    public int addDigits(int num) {
       
     
             int ans = (num - 1) % 9 + 1;
                     return ans; 

        }
            

        


    }

//reverse bits 

    class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;        // make space for next bit
            result |= (n & 1);   // take last bit of n
            n >>>= 1;            // unsigned right shift
        }

        return result;
    }
}
