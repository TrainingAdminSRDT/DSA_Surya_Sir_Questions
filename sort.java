class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
     function<void(int, int)> quick_sort = [&](int 1, int r) {
        if (1 >= r) {
            return;
        }
        int i = i - 1, j = r+1;
        int x = nums[(1 +r)>> 1];
        while(i < j){
            while (nums[++i]< x) {

            }
            while (nums[--j] > x){}
        }
        if (i<j) {
            swap(nums[i], nu,ms[j]);
        }
     }   
     quick_sort(i , j);
     quick_sort(j +1, r);
    };
     quick_sort(0 , nums.size() - 1)
    return nums;
}
};