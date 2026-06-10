//program 1
/*class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0, j = n - 1, k = n - 1;

        while (i <= j) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if (a > b) {
                ans[k] = a;
                i++;
            } else {
                ans[k] = b;
                j--;
            }
            k--;
        }

        return ans;
    }
}/* */
    
//program 2
/*class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length  -1;
        for (int i = 0;i<nums.length;i++){
            int mid = (left+right) /2;
            if (nums [mid]==target){ 
                return mid;
            } 
            else if (nums[mid]<target){
                left = mid+1;

            }
            else{
                right = mid-1;
            }
        }return -1;
    }
}/* */

//program 3
/*class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}/* */

//program 4
/*class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}/* */

//program 5
/*class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); 

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}/* */

//program 6
/*class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}/* */

//program 7
/*class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}/* */
