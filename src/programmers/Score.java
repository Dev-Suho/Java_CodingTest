package programmers;

import java.util.Arrays;

public class Score {

    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];

            for (int i = 0; i < photo.length; i++) {
                int score = 0;
                for (String person : photo[i]) {
                    for (int j = 0; j < name.length; j++) {
                        if (person.equals(name[j]))
                            score += yearning[j];
                    }
                }
                answer[i] = score;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(solution.solution(name, yearning, photo));
    }
}
