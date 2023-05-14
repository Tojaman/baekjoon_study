package _6주차_.수찾기_1920번;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 이분 탐색을 하기 위해 정렬한다.
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            System.out.println(binarySearch(arr, Integer.parseInt(st.nextToken())));
        }
    }
    public static int binarySearch(int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) return 1;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return 0;
    }
}
/*        for (int i = 0; i < n; i++) {
            int exit = 0;
            int tmp = Integer.parseInt(st.nextToken());
            for (int j = 0; j < m; j++) {
                if (arr[j] == tmp) {
                    exit = 1;
                    break;
                }
            }
            bw.write(Integer.toString(exit) + "\n");
            bw.flush();
        }
        bw.close();*/