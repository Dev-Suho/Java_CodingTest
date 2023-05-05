package programmers;

public class BinarySearch {

    static class Solution {
        public int solution(int[] list, int target) {
            int start = 0;
            int end = list.length - 1;
            int mid = start + end / 2;

            while (start <= end) {
                if (list[mid] == target) {
                    return mid;
                } else if (list[mid] > target) {
                    mid -= 1;
                } else {
                    mid += 1;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = {1, 5, 7, 1};
        int target = 9;
        System.out.println(solution.solution(list, target));
    }
}
