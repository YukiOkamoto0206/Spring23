class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        int l = 1;
        int r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            int l_sum = m % 2 == 0 ? (1+m) * m / 2 : (1+m) * (m-1) / 2 + (m+1) / 2;
            int r_sum = n-m-1 % 2 == 0 ? (m+n) * (n-m-1) / 2 : (m+n) * (n-m) / 2 + (n+m) / 2;
            if (l_sum < r_sum) {
                l = m+1;
            } else if (r_sum < l_sum) {
                r = m-1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
