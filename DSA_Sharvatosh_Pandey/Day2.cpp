#include <vector>

// 169. Majority Element

class Solution {
public:
    int majorityElement(std::vector<int>& nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
};


// 26. Remove Duplicates from Sorted Array

class Solution {
public:
    int removeDuplicates(std::vector<int>& nums) {
        if (nums.size() == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
};