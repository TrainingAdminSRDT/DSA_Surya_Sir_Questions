class Solution {

    public void merge(int[] nums, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        // merge both halves
        while (i <= mid && j <= ei) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // left part
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // copy back to original array
        for (int x = 0; x < temp.length; x++) {
            nums[si + x] = temp[x];
        }
    }

    public void mergeSort(int[] nums, int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);

        merge(nums, si, mid, ei);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}