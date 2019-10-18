/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 2 - Loops
 *  Last modified:     October 11, 2019
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double harmonicNumber = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1 / (Math.pow(i, r));
        }
        System.out.println(harmonicNumber);
    }
}
