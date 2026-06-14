#include <string>
#include <cctype>

using namespace std;

class ValidPalindrome {
public:
    bool isPalindrome(string s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !isalnum(static_cast<unsigned char>(s[i]))) {
                i++;
            }
            while (i < j && !isalnum(static_cast<unsigned char>(s[j]))) {
                j--;
            }
            if (tolower(static_cast<unsigned char>(s[i])) != tolower(static_cast<unsigned char>(s[j]))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
};
