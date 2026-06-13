// MERGE INTERVAL

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (start, end) -> Integer.compare(start[0], end[0]));
        int s = intervals[0][0];
        int e = intervals[0][1];
        List<int[]> result = new ArrayList<>();
        for (int i=1 ; i<intervals.length ; i++){
            if(e < intervals[i][0]){
                result.add(new int[]{s, e});
                s = intervals [i][0];
                e = intervals [i][1];
            }else{
                e = Math.max(e, intervals[i][1]);
            }
        }
        result.add(new int[]{s, e});
        return result.toArray(new int[result.size()][]);
    }
}


// SORT AN ARRAY

class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int n = nums.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(nums, 0, i);

            heapify(nums, i, 0);
        }

        return nums;
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;       
        int left = 2 * i + 1;
        int right = 2 * i + 2; 

        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(nums, i, largest);
            heapify(nums, n, largest);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



//
