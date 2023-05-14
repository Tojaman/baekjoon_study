package _5주차_.가장_긴_증가하는_부분_수열_11053번;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        */
/*
        배열을 순서대로 돌면서 앞 뒤를 비교한다.
        앞이 뒤보다 작다면 -> cnt++
        앞이 뒤보다 크다면 -> 아무것도 하지 않는다.
            i번째와 i+1번째가 아닌 i-1과 i+1을 비교해야 됨
         *//*

        int cnt = 1;
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            j = i;
            if(arr[i] == arr[i+1])
                cnt++;
            else {
                int j = i - 1;
            }

        }
    }
}
*/
