class ValidPerfectSquare {
public:
    bool isPerfectSquare(int num) {
        long long l = 1;
        long long r = num / 2;
        if (num == 1) return true;
        while (l <= r) {
            long long m = (l + r) / 2;
            long long sq = m * m;
            if (sq == num) return true;
            else if (sq > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
};
