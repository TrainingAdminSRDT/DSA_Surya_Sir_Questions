class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        double sum = 0;
        for (int i = 0 ; i < n && i < k ; i++){
            sum += nums[i];
        }
        //System.out.println("sum =" + sum);
        int i = 0;
        int j = k - 1;
        double max = Integer.MIN_VALUE;
        while (j < n){

            double avg = sum / k;
            max = Math.max(max , avg);
            //System.out.println("avg = " + avg + "max = " + max);
            sum -= nums[i];
            i++;
            if (j+ 1 < n){
                sum += nums[j + 1]; 
            }
            j++;
            //System.out.println("sum =" + sum);
        }

        return max;
    }
}
