package GREEDY_ALGORITHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Binary_Inversions {

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

            long maxInversions = 0;

            long ones = 0, inversions = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {
                    ones++;
                }
                else {
                    inversions += ones;
                }
            }

            maxInversions = Math.max(maxInversions, inversions);

            int idx = -1;
            // Fliping left-most 0 to 1
            for(int i = 0; i < n; i++) {
                if(arr[i] == 0) {
                    arr[i] = 1;
                    idx = i;
                    break;
                }
            }

            ones = 0; inversions = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {
                    ones++;
                }
                else {
                    inversions += ones;
                }
            }

            maxInversions = Math.max(maxInversions, inversions);
            if(idx != -1) {
                arr[idx] = 0;
            }

            //Fliping right-most 1 to 0
            for(int i = n - 1; i >= 0; i--) {
                if(arr[i] == 1) {
                    arr[i] = 0;
                    break;
                }
            }

            ones = 0; inversions = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {
                    ones++;
                } 
                else {
                    inversions += ones;
                }
            }

            maxInversions = Math.max(maxInversions, inversions);

            sb.append(maxInversions).append("\n");
        }

        out.println(sb.toString());
        out.flush();
        br.close();
    }    
}