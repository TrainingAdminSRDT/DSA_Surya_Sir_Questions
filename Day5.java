//  35 Search Insert Position


class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left=mid+1;
            }

        }
        return left;
    }
}



// 367 Valid Perfect Square


class Solution {
    public boolean isPerfectSquare(int num) {
        long left=1;
        long right=num;
        while(left<=right){
            long mid=left+(right-left)/2;
            long sqr=mid*mid;
            if(sqr==num){
                return true;
            }
            else if(sqr<num) {
                left=mid+1;
            }
            else{right=mid-1;}
        }
        return false;
        
    }
}





// 344 Reverse String



class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1; //two pointer approach
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    

        
    }
}



// 242 Valid Anagram


class Solution {
    public boolean isAnagram(String s, String t) {
        char arrA[]=s.toCharArray();
        Arrays.sort(arrA);
        char arrB[]=t.toCharArray();
        Arrays.sort(arrB);


        return Arrays.equals(arrA, arrB); 
        
    }
}



// 58  Length of last word



class Solution {
    public int lengthOfLastWord(String s) {
         int i=s.length()-1;
         while(i>=0 && s.charAt(i) == ' '){
            i--;
         }
         int j=i;
        while(j>=0 && s.charAt(j)!=' '){
            j--;
        }
        return i-j;

    }
}
        



// 125  Valid Palindrome



class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

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




        
            
        
    

        
    

