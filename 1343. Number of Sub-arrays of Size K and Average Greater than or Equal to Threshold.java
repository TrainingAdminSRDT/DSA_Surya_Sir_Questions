class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        double sum = 0;
        for (int i = 0 ; i < n && i < k ; i++){
            sum += arr[i];
        }
        int count = 0;
        int i = 0;
        int j = k - 1;
        while (j < n){

            double avg = sum / k;
            if (avg >= threshold){
                count++;
            }
            sum -= arr[i];
            i++;
            if (j + 1 < n){
                sum += arr[j + 1];
            }
            j++;
        }
        return count;
    }
}
