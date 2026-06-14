#include <vector>

using namespace std;

class SortArray {
public:
    vector<int> sortArray(vector<int>& nums) {
        int p = 0;
        int r = nums.size() - 1;
        return mergeSort(nums, p, r);
    }

    vector<int> mergeSort(vector<int>& nums, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(nums, p, q);
            mergeSort(nums, q + 1, r);
            merge(nums, p, q, r);
        }
        return nums;
    }

    vector<int> merge(vector<int>& a, int p, int q, int r) {
        vector<int> left(q - p + 1);
        vector<int> right(r - q);
        int i = 0, j = 0, k = 0;
        for (i = 0; i < q - p + 1; i++) {
            left[i] = a[p + i];
        }
        for (i = 0; i < r - q; i++) {
            right[i] = a[q + i + 1];
        }
        i = 0;
        j = 0;
        k = p;
        while (i < q - p + 1 && j < r - q) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < q - p + 1) {
            a[k++] = left[i++];
        }
        while (j < r - q) {
            a[k++] = right[j++];
        }
        return a;
    }
};
