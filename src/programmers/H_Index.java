package programmers;

import java.util.Arrays;
import java.util.Map;

public class H_Index {

    static class Solution {
        public int solution(int[] citations) {
            int h_index = 0;

            Arrays.sort(citations);
            int max = Math.max(citations[0], citations[citations.length-1]);
            System.out.println("max = " + max);
            for (int i = 0; i < citations.length; i++) {
                if (citations[citations.length - (1 + i)] >= i + 1) {
                    h_index = i + 1;
                }
            }

            return h_index;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = {3, 0, 6, 1, 5};
        System.out.println(solution.solution(list));
    }
}
