package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_from_N_to_1 {
    public static void recur(int i, StringBuilder sb) {

        if(i <= 0) {
            return;
        }
        sb.append(i).append(" ");
        recur(i - 1, sb);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        recur(n, sb);
        System.out.println(sb.toString().trim());
        br.close();
    }
}
