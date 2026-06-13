class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) { // Only iterate till half of the string
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) { // Correct comparison
                return false; // 'False' should be 'false' in Java
            }
        }
        return true; // Moved outside loop to return only if all checks pass
    }
}