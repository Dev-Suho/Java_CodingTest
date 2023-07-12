package ErpTest;

public class Cube {
    public static void main(String[] args) {
        int[][] cube = new int[5][5];
        int evenNum = 2;

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                if (((i + j) % 2 == 0) && (i % 4 != 0 || j % 4 != 0))  {
                    cube[i][j] = evenNum;
                    evenNum += 2;
                }
            }
        }

        for (int[] cubeY : cube) {
            for(int cubeX : cubeY) {
                System.out.print(cubeX + " ");
            }
            System.out.println();
        }
    }
}
