/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: Week 6 - Recursion
 *  Last modified:     May 25, 2020
 **************************************************************************** */

public class TrinomialDP {

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (k < -n && k > n) return 0;
        long[][] trinomial = new long[n + 1][2 * n + 1];

        if (k < 0) k = -k;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                trinomial[0][0] = 1;
                if (i == j) trinomial[i][j] = 1;
                else if (j > i) trinomial[i][j] = 0;
                else if (i > 0 && j == 0) {
                    trinomial[i][j] = trinomial[i - 1][j + 1] +
                            trinomial[i - 1][j] + trinomial[i - 1][j + 1];
                }
                else trinomial[i][j] = trinomial[i - 1][j - 1] +
                            trinomial[i - 1][j] + trinomial[i - 1][j + 1];
            }
        }

        return trinomial[n][k];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        StdOut.println(trinomial(n, k));
    }
}
