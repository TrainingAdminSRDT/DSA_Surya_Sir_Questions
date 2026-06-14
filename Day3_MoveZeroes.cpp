#include <vector>

using namespace std;

class MoveZeroes {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> temp(nums.size());
        int k = 0;
        int j = nums.size() - 1;
        for (int x : nums) {
            if (x != 0) {
                temp[k++] = x;
            } else {
                temp[j--] = x;
            }
        }
        for (size_t i = 0; i < nums.size(); i++) {
            nums[i] = temp[i];
        }
    }
};
