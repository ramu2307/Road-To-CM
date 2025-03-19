package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Log2 {
    public static long recur(long n) {

        if(n <= 1) {
            return 0;
        }

        return 1 + recur(n/2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(recur(n));
        br.close();
    }
}
