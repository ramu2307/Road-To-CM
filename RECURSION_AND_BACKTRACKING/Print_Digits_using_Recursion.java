package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_Digits_using_Recursion {

    public static void recur(int n) {

        if(n == 0) {
            return;
        }
        
        recur(n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                System.out.println(0);
                continue;
            }
            
            recur(n);
            System.out.println();
        }
        br.close();
    }
}