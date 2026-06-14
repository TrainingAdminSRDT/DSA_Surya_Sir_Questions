#include <vector>

using namespace std;

class MergeSortedArray {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int> arr(m + n);
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                arr[k--] = nums1[i--];
            } else {
                arr[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            arr[k--] = nums1[i--];
        }
        for (i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
};
