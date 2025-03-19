package RECURSION_AND_BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_of_a_Matrix {

    public static void recur(int i, int j, int[][] v1, int[][] v2, int[][] ans, boolean[][] visited) {

        if(i < 0 || j < 0) {
            return;
        }

        ans[i][j] = v1[i][j] + v2[i][j];
        visited[i][j] = true;

        if(i > 0 && !visited[i - 1][j]) {
            recur(i - 1, j, v1, v2, ans, visited);
        }
        
        if(j > 0 && !visited[i][j - 1]) {
            recur(i, j - 1, v1, v2, ans, visited);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] v1 = new int[r][c];
        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++) {
                v1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] v2 = new int[r][c];
        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++) {
                v2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] ans = new int[r][c];
        boolean[][] visited = new boolean[r][c];
        recur(r - 1, c - 1, v1, v2, ans, visited);
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
