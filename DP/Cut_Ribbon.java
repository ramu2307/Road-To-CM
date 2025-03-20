package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cut_Ribbon {

    static int dp[];

    // // TC : O(3^n)
    // // SC : O(n) -> space used in the call stack
    // public static int maxPieces(int sum, int a, int b, int c, int target) {

    //     if(sum == target) {
    //         return 0;
    //     }

    //     if(sum > target) {
    //         return Integer.MAX_VALUE;
    //     }
        
    //     int cntA = 1 + maxPieces(sum + a, a, b, c, target);
    //     int cntB = 1 + maxPieces(sum + b, a, b, c, target);
    //     int cntC = 1 + maxPieces(sum + c, a, b, c, target);

    //     return Math.max(cntA, Math.max(cntB, cntC));  
    // }

    // //<--------------------------------------------------------------------->

    // // TC : O(n)
    // // SC : O(n) -> dp table + O(n) -> recursive stack
    // public static int maxPieces(int sum, int a, int b, int c, int target) {

    //     if(sum == target) {
    //         return 0;
    //     }

    //     if(sum > target) {
    //         return Integer.MAX_VALUE;
    //     }

    //     if(dp[sum] != -1) {
    //         return dp[sum];
    //     }
        
    //     int cntA = 1 + maxPieces(sum + a, a, b, c, target);
    //     int cntB = 1 + maxPieces(sum + b, a, b, c, target);
    //     int cntC = 1 + maxPieces(sum + c, a, b, c, target);

    //     return dp[sum] = Math.max(cntA, Math.max(cntB, cntC));
        
    // }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0; // Base Case

        //System.out.println(maxPieces(0, a, b, c, target));

        for(int i = 0; i <= target; i++) {

            if(dp[i] == -1) continue;

            if(i + a <= target) {
                dp[i + a] = Math.max(dp[i + a], dp[i] + 1);
            }

            if(i + b <= target) {
                dp[i + b] = Math.max(dp[i + b], dp[i] + 1);
            }

            if(i + c <= target) {
                dp[i + c] = Math.max(dp[i + c], dp[i] + 1);
            }
        }

        System.out.println(dp[target]);
        br.close();

    }
}
