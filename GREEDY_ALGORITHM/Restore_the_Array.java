package GREEDY_ALGORITHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Restore_the_Array {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n - 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int[] ans = new int[n];
            ans[0] = arr[0];
            ans[n - 1] = arr[n - 2];
            for(int i = 1; i < n - 1; i++) {
                ans[i] = Math.min(arr[i], arr[i - 1]);
            }

            for(int num : ans) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        out.println(sb.toString());
        out.flush();
        br.close();
    }
}