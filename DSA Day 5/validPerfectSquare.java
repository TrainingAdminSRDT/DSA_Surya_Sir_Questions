class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long rights = num;
        while(left<=rights) {
            long mid = left + (rights-left)/2;
            long sqr = mid*mid;

            if(sqr == num) {
                return true;
            }
                else if(sqr < num) {
                    left = mid+1;
                } else {
                    rights = mid-1;
                }
            
        }
        return false;
        
    }
}