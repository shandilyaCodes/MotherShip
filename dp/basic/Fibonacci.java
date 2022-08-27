package basic;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibRec(6));
        System.out.println(fibTopDown(6));
        System.out.println(fibBottomUp(6));
        System.out.println(fibBottomUpSpaceOptimised(7));
    }

    // Normal recursive solution
    private static int fibRec(int n) {
        if(n <= 1)
            return n;
        return fibRec(n-2) + fibRec(n-1);
    }

    // Top-Down approach DP
    private static int fibTopDown(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fibTopDown(n-2) + fibTopDown(n-1);

        return dp[n];
    }

    // Bottom up Tabulation approach
    private static int fibBottomUp(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        for (int i = 0; i <= n; i++) {
            if(i <= 1)
                dp[i] = i;
            else
                dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

    // Space optimised bottom up tabulation approach
    private static int fibBottomUpSpaceOptimised(int n) {
        int prevPrev = 0;
        int prev = 1;
        int cur = -1;
        for (int i = 0 ; i <= n; i++) {
            if (i <= 1)
                cur =  i;
            else {
                cur = prev + prevPrev;
                prevPrev = prev;
                prev = cur;
            }
        }
        return cur;
    }
}
