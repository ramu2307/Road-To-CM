package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Print_Even_Indices {
    public static void recur(int i, int n, int[] arr, StringBuilder sb) {

        if(i >= n) {
            return;
        }

        recur(i + 1, n, arr, sb);

        if((i & 1) == 0) {
            sb.append(arr[i]).append(" ");
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <  n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        recur(0, n, arr, sb);
        System.out.println(sb.toString().trim());
        br.close();
    }
}
