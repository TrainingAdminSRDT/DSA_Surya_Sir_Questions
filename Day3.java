// 653  Two Sum IV- Input is a BST


class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }

    private boolean dfs(TreeNode node, int k, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }

        if (set.contains(k - node.val)) {
            return true;
        }

        set.add(node.val);

        return dfs(node.left, k, set) || dfs(node.right, k, set);
    }
}



// 283  Move Zeroes


class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}



// 1480  Running Sum of 1d Array


class Solution {
    public int[] runningSum(int[] nums) {
        
            for(int i=1; i<nums.length; i++){
                nums[i]=nums[i]+nums[i-1];
            }

            return nums;
    }
}



// 643  Maximum Average Subarray I



class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        int ans=s;
        for(int i=k; i<nums.length; i++){
            s+=(nums[i]-nums[i-k]);
            ans=Math.max(ans,s);
        }
        return ans*1.0/k;

    }
}



// 2090  K radius Subarray Averages


class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        if (k == 0) {
            return nums;
        }

        int windowSize = 2 * k + 1;

        if (windowSize > n) {
            return ans;
        }

        long sum = 0;

        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        ans[k] = (int) (sum / windowSize);

        for (int i = windowSize; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - windowSize];

            ans[i - k] = (int) (sum / windowSize);
        }

        return ans;
    }
}