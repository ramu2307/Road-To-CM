package GREEDY_ALGORITHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Number_Factorization {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();

            int temp = n;
            for(int i = 2; i * i <= n; i++) {

                while(temp % i == 0) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                    temp = temp/i;
                }
            }

            if(temp > 1) {
                map.put(temp, 1);
            }

            int maxExponent = 0;

            for(int exponent : map.values()) {
                maxExponent = Math.max(maxExponent, exponent);
            }

            long[] res = new long[maxExponent];
            Arrays.fill(res, 1);

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                for(int i = 0; i < value; i++) {
                    res[i] *= key;
                }
            }

            long ans = 0;

            for(long num : res) {
                ans += num; 
            }

            sb.append(ans).append("\n");
        }

        out.println(sb.toString());

        out.flush();
        br.close();
    }
}