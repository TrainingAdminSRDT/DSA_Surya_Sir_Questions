#include <vector>

using namespace std;

class KRadSubarrayAvg {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> temp(n, -1);
        long long s = 0;
        for (int i = 0; i < n; i++) {
            s += nums[i];
            if (i >= 2 * k) {
                temp[i - k] = static_cast<int>(s / (2 * k + 1));
                s -= nums[i - 2 * k];
            }
        }
        return temp;
    }
};
