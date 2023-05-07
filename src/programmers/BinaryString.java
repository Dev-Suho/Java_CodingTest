package programmers;

public class BinaryString {

    static class Solution {
        public int solution(String t, String p) {
            int count = 0;
            int p_length = p.length();
            long pValue = Long.parseLong(p);

            for(int i = 0; i < t.length() - p_length + 1; i++) {
                String str = t.substring(i, p_length + i);
                int result = Integer.parseInt(str);
                if (result <= pValue) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("500220839878", "7"));
    }
}
