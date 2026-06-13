class Solution {
    public int lengthOfLastWord(String s) {
        
        int i=s.length()-1;
        int n=s.length();
        while(i>=0 && s.charAt(i)==' '){
            i--;
            n--;
        }


        while(i>=0 && s.charAt(i)!=' '){
            i--;
        }

        return n-i-1;
    }
}