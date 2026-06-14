#include <vector>
#include <algorithm>

using namespace std;

class MergeIntervals {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        if (intervals.empty()) return {};
        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b) {
            return a[0] < b[0];
        });
        vector<vector<int>> list;
        int st = intervals[0][0];
        int ed = intervals[0][1];
        for (size_t i = 1; i < intervals.size(); i++) {
            if (intervals[i][0] <= ed) {
                ed = max(ed, intervals[i][1]);
            } else {
                list.push_back({st, ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }
        list.push_back({st, ed});
        return list;
    }
};
