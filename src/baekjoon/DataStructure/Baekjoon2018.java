package baekjoon.DataStructure;

import java.util.Scanner;

public class Baekjoon2018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int startPoint = 1;
        int endPoint = 1;
        int sum = 1;

        while (endPoint != num) {
            if(sum == num) {
                count++;
                endPoint++;
                sum = sum + endPoint;
            } else if (sum > num) {
                sum = sum - startPoint;
                startPoint++;
            } else {
                endPoint++;
                sum = sum + endPoint;
            }
        }

        System.out.println(count);
    }
}
