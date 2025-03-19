package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {
    public static void recur(int i, int n, StringBuilder sb) {

        if(i > n) {
            return;
        }

    
        for(int j = 1; j <= n - i; j++) {
            sb.append(" ");
        }

        for(int j = 1; j < i; j++) {
            sb.append("*");
        }
        sb.append("*");
        for(int j = 1; j < i; j++) {
            sb.append("*");
        }
        sb.append("\n");

        recur(i + 1, n, sb);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        recur(1, n, sb);
        System.out.println(sb.toString());
        br.close();
    }
}
