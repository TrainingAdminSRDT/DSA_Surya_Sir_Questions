class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> avgs(n, -1);

        long long windowSize = 2LL * k + 1;

        if (windowSize > n)
            return avgs;

        long long sum = 0;

        // First window
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        avgs[k] = sum / windowSize;

        // Slide the window
        for (int right = windowSize; right < n; right++) {
            sum += nums[right];
            sum -= nums[right - windowSize];

            int center = right - k;
            avgs[center] = sum / windowSize;
        }

        return avgs;
    }
};
