package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max_Number {
    public static void recur(int i, int n, int[] arr, int max) {

        if(i >= n) {
            System.out.println(max);
            return;
        }

        if(arr[i] > max) {
            max = arr[i];
        }
        recur(i + 1, n, arr, max);

        
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <  n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        recur(0, n, arr, Integer.MIN_VALUE);
        br.close();
    }
}
