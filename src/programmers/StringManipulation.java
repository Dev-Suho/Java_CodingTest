package programmers;

public class StringManipulation {

    static class Solution {
        public String solution(String str) {
            if (str == null || str.length() <= 2) return str;

            StringBuilder sb = new StringBuilder();
            char prev = str.charAt(0);
            int count = 1;
            for (int i = 1; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (curr == prev) {
                    count++;
                } else {
                    sb.append(prev);
                    sb.append(count);
                    prev = curr;
                    count = 1;
                }
            }
            sb.append(prev);
            sb.append(count);
            String compressed = sb.toString();

            return compressed.length() < str.length() ? compressed : str;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "aabbcccccaaa";
        System.out.println(solution.solution(str));
    }
}
