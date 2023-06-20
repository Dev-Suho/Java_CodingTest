package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());

        long[] arr = new long[length+1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < length+1; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(long i : arr) {
            System.out.println("i = " + i);
        }

        for(int i = 0; i < question; i++) {
            st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());

            System.out.println(arr[endNum] - arr[firstNum-1]);

        }
    }

}
