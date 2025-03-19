package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_from_1_to_N {

    public static void recur(int i, int n) {

        if(i > n) {
            return;
        }

        System.out.println(i);
        recur(i + 1, n);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recur(1, n);
        br.close();
    }
}