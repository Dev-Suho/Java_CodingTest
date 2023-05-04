package programmers;

public class MaxMin {
    
    static class Solution {
        public String solution(String s) {
            String[] str = s.split(" ");
            int minNum = Integer.parseInt(str[0]);
            int maxNum = Integer.parseInt(str[0]);

            for (String value : str) {
                int n = Integer.parseInt(value);

                if (minNum > n)
                    minNum = n;
                if (maxNum < n)
                    maxNum = n;
            }

            return minNum + " " + maxNum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1 2 3 4"));
    }
}
