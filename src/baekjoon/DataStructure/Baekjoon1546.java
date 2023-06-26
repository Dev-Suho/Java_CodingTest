package baekjoon.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int max = 0;

        count = sc.nextInt();

        int[] arr = new int[count];

        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
            sum += arr[i];
        }

        System.out.println(sum * 100.0/max/count);
    }
}
