package programmers;

public class Remainder {

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i < n; i++) {
                if(n % i == 1) {
                    answer += i;
                    break;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }
}
