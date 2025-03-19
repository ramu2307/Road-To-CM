package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base_Converssion {
    public static void recur(int n, StringBuilder sb) {

        if(n <= 0) {
            return;
        }

        sb.append(n % 2);
        n = n / 2;
        recur(n, sb);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            recur(n, sb);
            System.out.println(sb.reverse().toString());
        }
        br.close();
    }
}
