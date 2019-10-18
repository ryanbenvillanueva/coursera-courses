/* *****************************************************************************
 *  Name:              Ryam Ben S. Villanueva
 *  Programming Assignment: 2 - Loops
 *  Last modified:     October 11, 2019
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int rows = n;
        int cols = n;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (Math.abs(i - j) <= width) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            if (i != rows) {
                System.out.println();
            }
        }
    }
}
