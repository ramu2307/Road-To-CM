package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Apple_Division {

    static long ans = Integer.MAX_VALUE;

    public static void recur(int idx, int n, long sum, long total, int[] arr) {


        if(idx == n) {
            long s1 = sum;
            long s2 = total - sum;
            ans = Math.min(ans, Math.abs(s1 - s2));
            return;
        }

        recur(idx + 1, n, sum + arr[idx], total, arr);

        recur(idx + 1, n, sum, total, arr);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <  n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        long total = arr[0];
        for(int i = 1; i < n; i++) {
            total += arr[i];
        }

        recur(0, n, 0L, total, arr);

        System.out.println(ans);
        br.close();
    }
}
