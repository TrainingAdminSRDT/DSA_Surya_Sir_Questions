class PalindromeNumber {
public:
    bool isPalindrome(int x) {
        long long rev = 0;
        int z = x;
        
        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        
        return z == rev;
    }
};
