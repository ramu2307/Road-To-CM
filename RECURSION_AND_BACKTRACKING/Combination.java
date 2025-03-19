package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination {

    public static long recur(long n, long r) {

        if(r > n) {
            return 0;
        }

        if(r == 0) {
            return 1;
        }

        return recur(n - 1, r - 1) * n / r;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());
        System.out.println(recur(n, r));
        br.close();
    }
}
