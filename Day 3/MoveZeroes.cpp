class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int j = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Fill remaining positions with 0
        while (j < nums.size()) {
            nums[j++] = 0;
        }
    }
};