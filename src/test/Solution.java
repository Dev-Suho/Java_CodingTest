package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = sc.nextInt();
        int max = N;
        int answer = -1;

        for(int i = 1; i < N; i++) {
            max = max * 10;
            max += N % 10;
        }

        System.out.println("max = " + max);

        for(int j = 0; j <= s.length() - N; j++) {
            String str = s.substring(j, j+N);

            if(Integer.parseInt(str) <= max && Integer.parseInt(str) > answer) {
                answer = Integer.parseInt(str);
            }
        }

        System.out.println("answer = " + answer);
    }

}
