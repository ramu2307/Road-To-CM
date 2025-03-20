package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Palindrome_Array {

    public static boolean recur(int left, int right, int[] arr) {

        if(left > right) {
            return true;
        }

        if(arr[left] != arr[right]) {
            return false;
        }

        return recur(left + 1, right - 1, arr);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <  n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(recur(0, n - 1, arr) ? "YES" : "NO");
        br.close();
    }
}
