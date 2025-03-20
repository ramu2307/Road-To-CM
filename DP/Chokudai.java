package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chokudai {

    static int[][] dp;

    static int MOD = 1000000007;

    // public static int recur(int idx, int n, String s, String req, int reqIdx) {

    //     if(reqIdx == req.length()) {
    //         return 1;
    //     }

    //     if(idx == n) {
    //         return 0;
    //     }

    //     if(dp[idx][reqIdx] != -1) {
    //         return dp[idx][reqIdx];
    //     }
        
    //     int cnt = 0;
    //     cnt = (cnt + recur(idx + 1, n, s, req, reqIdx)) % MOD; //Not Take;

    //     if(s.charAt(idx) == req.charAt(reqIdx)) {
    //         cnt = (cnt + recur(idx + 1, n, s, req, reqIdx + 1)) % MOD; //Take
    //     }

    //     dp[idx][reqIdx] = cnt;
    //     return cnt;
        
    // }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String req = "chokudai";
        int n = s.length();
        int m = req.length();
        dp = new int[n + 1][m + 1];
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {

                if(s.charAt(i - 1) == req.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][m]);
        br.close();
    }
}
