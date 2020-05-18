/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: Week4 - Input and Output
 *  Last modified:     May 18, 2020
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sequence = StdIn.readAllInts();
        int[] frequencies = new int[m + 1];
        double shannonEntropy = 0;

        for (int i = 0; i < sequence.length; i++) {
            frequencies[sequence[i]]++;
        }

        for (int i = 1; i <= m; i++) {
            double proportion = (double) frequencies[i] / sequence.length;
            double term = -proportion * (Math.log(proportion) / Math.log(2));

            if (proportion == 0) {
                term = 0;
            }

            shannonEntropy += term;
        }

        StdOut.printf("%.4f", shannonEntropy);
    }
}
