#include <vector>

using namespace std;

class SquaresSortedArray {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int j = n - 1;
        vector<int> arr(n);
        for (int k = n - 1; k >= 0; k--) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                arr[k] = nums[i] * nums[i];
                i++;
            } else {
                arr[k] = nums[j] * nums[j];
                j--;
            }
        }
        return arr;
    }
};
