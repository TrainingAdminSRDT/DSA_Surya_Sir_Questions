#include <string>

using namespace std;

class LengthOfLastWord {
public:
    int lengthOfLastWord(string s) {
        int c = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s[i] != ' ') {
                c++;
            } else if (c > 0) {
                return c;
            }
        }
        return c;
    }
};
