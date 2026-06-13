#include <climits>
#include <cstdint>

// 7. Reverse Integer

class Solution {
public:
    int reverse(int x) {
        long long rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        if (rev > INT_MAX || rev < INT_MIN)
            return 0;

        return rev;
    }
};


// 9. Palindrome Number


class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0)
            return false;

        int temp = x;
        long long rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return temp == rev;
    }
};


// 258. Add Digits


class Solution {
public:
    int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }
}; 

// 190. Reverse Bits


class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t result = 0;

        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }

        return result;
    }
};
