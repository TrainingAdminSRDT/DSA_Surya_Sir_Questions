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



//search in rotated sorted array
class Solution {
    public int search(int[] nums, int target) {
      
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
            // Right half is sorted
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

}
//valid palindrome 
class Solution {
    public boolean isPalindrome(String s) {
        
        
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare after converting to lowercase
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

//intersection of two linked list
**
 /* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = (a!=null)  ? a.next : headB;
            b =(b!=null)  ? b.next: headA; 
        }
        return a;
    
             
        
        
    }
}

//reverse string 

class Solution {
    public void reverseString(char[] s) {
       

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
        
       
        


    

        
    

