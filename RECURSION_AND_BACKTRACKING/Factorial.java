package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void recur(long prod, long i, long n) {

        if(i > n) {
            System.out.println(prod);
            return;
        }

        prod = prod * i;
        
        recur(prod, i + 1, n);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        recur(1, 1, n);
        br.close();
    }
}
