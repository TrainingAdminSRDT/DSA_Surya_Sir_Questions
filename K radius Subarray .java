import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        
        Arrays.fill(avgs, -1);
        
        int windowSize = 2 * k + 1;
        
        if (n < windowSize) {
            return avgs;
        }
        
        long windowSum = 0;
        
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }
        
        avgs[k] = (int) (windowSum / windowSize);
        
        for (int i = windowSize; i < n; i++) {
            windowSum += nums[i] - nums[i - windowSize];
            
            int centerIndex = i - k;
            avgs[centerIndex] = (int) (windowSum / windowSize);
        }
        
        return avgs;
    }
}