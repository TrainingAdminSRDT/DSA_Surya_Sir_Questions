
public class FirstBad extends VersionControl {
    
	

	public  int firstBadVersion(int n) {
		
        int lo = 1;
        int hi = n;
        int ans = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isBadVersion(mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
	}

}