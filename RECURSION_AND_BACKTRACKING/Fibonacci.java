package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static int recur(int n) {

        if(n == 1) {
            return 0;
        }

        if(n == 2) {
            return 1;
        }

        return recur(n - 1) + recur(n - 2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(recur(n));
        br.close();
    }
}
