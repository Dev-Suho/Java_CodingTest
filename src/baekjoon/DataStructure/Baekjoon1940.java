package baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int item = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[item];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < item; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int i = 0, j = item-1;
        while(i < j) {
            if (arr[i] + arr[j] < num) i++;
            else if (arr[i] + arr[j] > num) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
