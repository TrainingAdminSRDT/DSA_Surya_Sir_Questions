class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int rev=0;
        int z=x;
        
        while(x>0){
            int rem= x%10;
            rev=rev*10+ rem;
            x/=10;
            
        }
        if(z==rev){return true;
        }
        else{return false;}
    }
}