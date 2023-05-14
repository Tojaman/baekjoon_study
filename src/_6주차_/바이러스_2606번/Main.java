package _6주차_.바이러스_2606번;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean [] visited;
    public static int[][] arrGraph;
    public static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());

        // arrGraph 초기화
       arrGraph = new int[n+1][n+1];
        visited = new boolean[n+1];
        Arrays.fill(visited, false);

        for (int i = 0; i < pair; i++) {
            int n1, n2;
            st = new StringTokenizer(br.readLine(), " ");
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            // n1*n2 = 1 삽입(연결된다는 뜻)
            arrGraph[n1][n2] = arrGraph[n2][n1]= 1;
        }
        dfs(1, n);
        // 1번 컴퓨터는 뺴야 하니깐 num-1
        System.out.println(num-1);
    }
    // 재귀를 이용한 dfs
    public static void dfs(int node, int n) {
        visited[node] = true; // 현재 노드(1) 방문 처리
        num += 1; // 감염된 컴퓨터 숫자

        int k = 0;
        for (int i = 1; i <= n; i++) {
            // node번쨰 행을 돌면서 값이 1인 열의 index를 찾고 index번쨰 열을 한 번도 방문하지 않았다면 dfs(index) 실행
            if (arrGraph[node][i] == 1 && visited[i] == false)
                dfs(i, n);
        }
    }
}