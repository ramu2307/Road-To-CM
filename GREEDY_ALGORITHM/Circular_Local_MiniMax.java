package GREEDY_ALGORITHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Circular_Local_MiniMax {

    // TC : O(n * log(n))
    // SC : O(n)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int result[] = new int[n];
            int mid = (n + 1)/2;
            int index = 0;

            for(int i = 0; i < mid; i++) {
                result[index] = arr[i];
                index += 2;
            }

            index = 1;
            for(int i = mid; i < n; i++) {
                result[index] = arr[i];
                index += 2;
            }

            boolean valid = true;

            for(int i = 0; i < n; i++) {

                int prev = result[(i + n - 1) % n];
                int next = result[(i + 1) % n];

                if(!((prev < result[i] && result[i] > next) || (prev > result[i] && result[i] < next))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                sb.append("YES").append("\n");
                for(int num : result) {
                    sb.append(num).append(" ");
                }
                sb.append("\n");
            }
            else {
                sb.append("NO").append("\n");
            }
        }

        out.println(sb.toString());
        out.flush();
    }
}