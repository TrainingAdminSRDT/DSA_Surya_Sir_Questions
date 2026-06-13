class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int s=0;
        for(int i=0;i<k;i++)
        {
            s=s+nums[i];
        }
        int ans=s;
        for(int i=k;i<nums.size();++i)
        {
            s=s+(nums[i]-nums[i-k]);
            ans=max(ans,s);
        }
        return ans*1.0/k;
    }
};