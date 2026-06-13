// 56 Merge Intervals




class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}



// 912 Sort an Array



class Solution {
    public int[] sortArray(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){ //counting sort
            largest= Math.max(largest,nums[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0; i<nums.length;i++){
            count [nums[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
        return nums;
    }
        
   
}



// 33 Search in Rotated Sorted Array


class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[low]<=arr[mid]){
                if(target>=arr[low]&& target<=arr[mid]){
                    high=mid;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if( target>arr[mid]&& target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }

            
        }
        return -1;
        
    }
    
}





