class Solution {
public:
    int majorityElement(vector<int>& nums) 
    {
        int count=0;
        int majority=0;
        for(int x: nums)
        {
            if(count==0)
            {
               majority=x;
               count=count+1;                
            }
            else
            {
                if(majority==x)
                {
                    count=count+1;
                }
                else
                {
                    count=count-1;
                }
            }
        }
        return majority;
    }
};