class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n=nums.size();
        int i,j;
        for (i=0;i<n-1;i++){
            for (j=i;j<n;j++){
                if(i!=j){
                    int ans=nums[i]+nums[j];

                
                if(ans==target)
                return {i,j};
            }}
        }return{};
        }
};