package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Summation {
    public static void recur(int i, int n, int[] arr, long sum) {

        if(i >= n) {
            System.out.println(sum);
            return;
        }

        sum += arr[i];
        
        recur(i + 1, n, arr, sum);

        
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <  n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        recur(0, n, arr, 0);
        br.close();
    }
}
