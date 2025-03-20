package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sequence_3N_1 {

    public static void recur(long n, ArrayList<Long> ans) {

        if(n == 1) {
            return;
        }

        if((n & 1) == 0) {
            ans.add(n/2);
            recur(n / 2, ans);
        }
        else {
            ans.add(3 * n + 1);
            recur(3 * n + 1, ans);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        ArrayList<Long> ans = new ArrayList<>();
        ans.add(n);
        recur(n, ans);
        System.out.println(ans.size());
        br.close();
    }
}