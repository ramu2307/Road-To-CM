package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Suffix_Sum {

    public static void recur(int idx, int n, int[] arr, int m, long sum) {

        if(m <= 0) {
            System.out.println(sum);
            return;
        }

        sum += arr[idx];
        recur(idx - 1, n, arr, m - 1, sum);


    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <  n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        recur(n - 1, n, arr, m, 0);
        br.close();
    }
}
