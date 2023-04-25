class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int m = nums.length;
        int n = sorted.length;
        int[][] dp = new int[m][n];
        //int high = Integer.MAX_VALUE;
        int res = LCS(nums, sorted, m, n, dp);
        return res;
    }

    public int LCS(int[] X, int[] Y, int m, int n, int[][] dp) {
        if (m == 0 || n == 0)
            return 0;
        //memoization - already calculated values need to be reutilized
        if (dp[m-1][n-1] != 0)
            return dp[m-1][n-1];
        if (X[m-1] == Y[n-1]) {
            //high = X[m-1];
            dp[m-1][n-1] = 1 + LCS(X, Y, m-1, n-1, dp);
            return dp[m-1][n-1];
        } else {
            dp[m-1][n-1] = Math.max(LCS(X, Y, m-1, n, dp),
                                LCS(X, Y, m, n-1, dp));
            return dp[m-1][n-1];
        }
    }
}
