package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class New_Skateboard {

    static long[] dp;

    // // TC : O(n)
    // // SC : O(n) -> Recursive stack
    // public static long subStringDivBy4(int i, String s) {

    //     if(i < 0) {
    //         return 0;
    //     }

    //     long cnt = subStringDivBy4(i - 1, s);
    //     if((s.charAt(i) - '0') % 4 == 0) {
    //         cnt++;
    //     }

    //     if(i > 0) {
    //         if(((s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0')) % 4 == 0) {
    //             cnt += i;
    //         }
    //     }
    //     return cnt;
    // }

    // //  <------------------------------------------------------------------------>

    // // TC : O(n)
    // // SC : O(n) -> dp Table + O(n) -> Recursive stack
    // public static long subStringDivBy4(int i, String s) {
    //     if(i < 0) {
    //         return 0;
    //     }

    //     if(dp[i] != -1) {
    //         return dp[i];
    //     }

    //     long cnt = subStringDivBy4(i - 1, s);
    //     if((s.charAt(i) - '0') % 4 == 0) {
    //         cnt++;
    //     }

    //     if(i > 0) {
    //         if(((s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0')) % 4 == 0) {
    //             cnt += i;
    //         }
    //     }
    //     return dp[i] = cnt;
    // }

    // // <----------------------------------------------------------------------->

    // // TC : O(n)
    // // SC : O(n) -> dp Table
    // public static void main(String[] args) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     PrintWriter out = new PrintWriter(System.out);
    //     String s = br.readLine();
    //     dp = new long[s.length()];
    //     long count = 0;
    //     for(int i = 0; i < s.length(); i++) {

    //         if((s.charAt(i) - '0') % 4 == 0) {
    //             dp[i]++;
    //         }

    //         if(i > 0) {
    //             if(((s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0')) % 4 == 0) {
    //                 dp[i] += i;
    //             }
    //         }

    //         count += dp[i];
    //     }

    //     out.println(count);
    //     out.flush();
    // }

    // // <--------------------------------------------------------------------------->
    
    // TC : O(n)
    // SC : O(1)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = br.readLine();
        long count = 0;
        for(int i = 0; i < s.length(); i++) {

            if((s.charAt(i) - '0') % 4 == 0) {
                count++;
            }

            if(i > 0) {
                if(((s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0')) % 4 == 0) {
                    count += i;
                }
            }
        }

        out.println(count);
        out.flush();
    }
}
