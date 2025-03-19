package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_Vowels {

    public static boolean isVowel(char ch) {

        if(ch == 'A' || ch == 'E' ||  ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }

        return false;
    }
    public static void recur(int idx, int cnt, String s, int n) {

        if(idx >= n) {
            System.out.println(cnt);
            return;
        }

        if(isVowel(s.charAt(idx))) {
            recur(idx + 1, cnt + 1, s, n);
        }
        else {
            recur(idx + 1, cnt, s, n);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        recur(0, 0, s, s.length());
        br.close();
    }
}
