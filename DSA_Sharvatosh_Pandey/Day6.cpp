// 56. Merge Intervals

#include <algorithm>
#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end());

        vector<vector<int>> result;

        for (int i = 0; i < intervals.size(); i++) {
            if (result.empty() || result.back()[1] < intervals[i][0]) {
                result.push_back(intervals[i]);
            } else {
                result.back()[1] = max(result.back()[1], intervals[i][1]);
            }
        }

        return result;
    }
};

// 912. Sort an Array

class SolutionSort {
public:
    vector<int> sortArray(vector<int>& nums) {

        auto quick_sort = [&](auto&& self, int l, int r) -> void {
            if (l >= r) return;

            int i = l - 1, j = r + 1;
            int x = nums[(l + r) >> 1];

            while (i < j) {
                do i++; while (nums[i] < x);
                do j--; while (nums[j] > x);

                if (i < j) {
                    swap(nums[i], nums[j]);
                }
            }

            self(self, l, j);
            self(self, j + 1, r);
        };

        quick_sort(quick_sort, 0, nums.size() - 1);
        return nums;
    }
};

// 33. Search in Rotated Sorted Array


class Solution {
public:
    int search(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half sorted hai
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half sorted hai
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
};


// 160. Intersection of Two Linked Lists

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *a = headA;
        ListNode *b = headB;

        while (a != b) {
            a = (a == NULL) ? headB : a->next;
            b = (b == NULL) ? headA : b->next;
        }

        return a;
    }
};