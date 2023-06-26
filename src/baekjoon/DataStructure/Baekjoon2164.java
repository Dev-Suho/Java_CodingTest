package baekjoon.DataStructure;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Baekjoon2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> myQueue = new LinkedList<>();
        int num = sc.nextInt();
        for (int i = 1; i < num+1; i++) {
            myQueue.add(i);
        }

        while(myQueue.size() > 1) {
            myQueue.poll();
            int poll = myQueue.poll();
            myQueue.add(poll);
        }
        System.out.println(myQueue.poll());
    }
}
