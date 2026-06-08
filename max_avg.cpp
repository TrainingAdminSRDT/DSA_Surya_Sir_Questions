class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int maxi=0;
        for (int i =0;i<k;i++){
            maxi+=nums[i];
        }
        int cur=maxi;
        for(int i =k;i<nums.size();i++){
           cur=cur -nums[i-k] + nums[i];
            maxi=max(cur,maxi);
        }
        return (double) maxi/k;
    }
};