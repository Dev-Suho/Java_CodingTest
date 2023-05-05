package programmers;

import java.util.Arrays;

public class Radius {

    static class Solution {
        public int solution(int[][] sizes) {
            int maxWidth = 0;
            int maxHeight = 0;

            for (int[] size : sizes) {
                Arrays.sort(size);
                maxWidth = Math.max(maxWidth, size[0]);
                maxHeight = Math.max(maxHeight, size[1]);
            }

            return maxWidth * maxHeight;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] list = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution.solution(list));
    }
}
