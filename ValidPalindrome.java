class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0 , j=s.length()-1;
        while(i<j){
            boolean atI=Character.isLetterOrDigit(s.charAt(i));
            boolean atJ=Character.isLetterOrDigit(s.charAt(j));
            if(atI && atJ){
    
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                    return false;
                i++;
                j--;
            }else if(!atI)
                i++;
            else
                j--;
        }

        return true;
    }
}