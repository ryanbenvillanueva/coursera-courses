/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 3 - Arrays
 *  Last modified:     5/16/2020
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] mines = new boolean[m + 2][n + 2];
        int[][] neighborCount = new int[m + 2][n + 2];

        int cells = (m + 2) * (n + 2);
        int[] interiorCells = new int[m * n];

        int index = 0;
        for (int i = 0; i < cells; i++) {
            if (!(i / (n + 2) == 0 || i / (n + 2) == (m + 1) ||
                    i % (n + 2) == 0 || i % (n + 2) == (n + 1))) {
                interiorCells[index] = i;
                index++;
            }
        }

        for (int i = 0; i < interiorCells.length; i++) {
            int randomIndex = (int) (Math.random() * interiorCells.length);
            int temp = interiorCells[randomIndex];
            interiorCells[randomIndex] = interiorCells[i];
            interiorCells[i] = temp;
        }

        int placedMine = 0;
        while (placedMine < k) {
            int row = interiorCells[placedMine] / (n + 2);
            int col = interiorCells[placedMine] % (n + 2);
            if (!mines[row][col]) {
                mines[row][col] = true;
            }
            placedMine++;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (mines[i][j]) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print(neighborCount[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}

