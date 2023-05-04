package programmers;

import java.util.Arrays;

public class Fibonacci {

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] fib = new int[n+1];

            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = (fib[i-1] + fib[i-2]) % 1234567;
            }

            answer = fib[n];

            return answer;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5));
    }
}
