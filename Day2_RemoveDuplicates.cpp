#include <vector>
#include <utility>

using namespace std;

class RemoveDuplicates {
public:
    int removeDuplicates(vector<int>& nums) {
        int k = 0;
        int i = 0;
        while (i < nums.size()) {
            if (nums[i] == nums[k]) {
                i++;
            } else {
                k++;
                swap(nums, i, k);
                i++;
            }
        }
        return k + 1;
    }

private:
    void swap(vector<int>& arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
};
