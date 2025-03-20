package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vacations {

    static int[][] dp;


    // // TC : O(3^n)
    // // SC : O(n)
    // public static int minRest(int idx, int n, int[] arr, int preActivity) {

    //     if(idx == n) {
    //         return 0;
    //     }

    //     int restDays = 1 + minRest(idx + 1, n, arr, 0);

    //     if((arr[idx] == 1 || arr[idx] == 3) && preActivity != 1) {

    //         restDays = Math.min(restDays, minRest(idx + 1, n, arr, 1));
    //     }

    //     if((arr[idx] == 2 || arr[idx] == 3) && preActivity != 2) {

    //         restDays = Math.min(restDays, minRest(idx + 1, n, arr, 2));
    //     }

    //     return restDays;
        
    // }

    // <------------------------------------------------------------------------------------>

    // // TC : O(3 * n)
    // //SC : dp Table -> O(3 * n) + Recursive Stack -> O(n)
    // public static int minRest(int idx, int n, int[] arr, int preActivity) {

    //     if(idx == n) {
    //         return 0;
    //     }

    //     if(dp[idx][preActivity] != -1) {
    //         return dp[idx][preActivity];
    //     }


    //     int restDays = 1 + minRest(idx + 1, n, arr, 0);

    //     if((arr[idx] == 1 || arr[idx] == 3) && preActivity != 1) {

    //         restDays = Math.min(restDays, minRest(idx + 1, n, arr, 1));
    //     }

    //     if((arr[idx] == 2 || arr[idx] == 3) && preActivity != 2) {

    //         restDays = Math.min(restDays, minRest(idx + 1, n, arr, 2));
    //     }


    //     dp[idx][preActivity] = restDays;

    //     return restDays;
        
    // }

    // <------------------------------------------------------------------------------------->

    // TC : O(n)
    // SC : O(3 * n)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // DP Table : dp[i][0] -> Rest, dp[i][1] -> Contest, dp[i][2] -> Gym
        dp = new int[n][3];
        
        //System.out.println(minRest(0, n, arr, 0));

        //Base Case (Day 0)
        dp[0][0] = 1; // If we rest on day 0
        dp[0][1] = (arr[0] == 1 || arr[0] == 3) ? 0 : Integer.MAX_VALUE;
        dp[0][2] = (arr[0] == 2 || arr[0] == 3) ? 0 : Integer.MAX_VALUE;

        for(int i = 1; i < n; i++) {

            // Always rest is possible
            dp[i][0] = 1 + Math.min(dp[i - 1][0],  Math.min(dp[i - 1][1], dp[i - 1][2]));

            //Doing contest if possible in arr[i]
            if(arr[i] == 1 || arr[i] == 3) {
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]);
            }
            else {
                dp[i][1] = Integer.MAX_VALUE;
            }

            //Doing Gym if possible on arr[i]
            if(arr[i] == 2 || arr[i] == 3) {
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
            else {
                dp[i][2] = Integer.MAX_VALUE;
            }

        }

        System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
        br.close();

    }
}