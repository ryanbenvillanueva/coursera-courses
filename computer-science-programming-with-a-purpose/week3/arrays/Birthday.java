/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 3 - Arrays
 *  Last modified:     05/15/2020
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] count = new int[n + 2];
        double[] fraction = new double[n + 2];

        for (int trial = 1; trial <= trials; trial++) {
            boolean[] hasBirthday = new boolean[n];
            int i = 0;

            while (true) {
                i++;
                int b = (int) (n * Math.random());
                if (hasBirthday[b]) {
                    break;
                }
                hasBirthday[b] = true;
            }

            count[i]++;
        }

        for (int f = 1; f < n + 2; f++) {
            int sum = 0;
            int c = 1;
            while (c <= f) {
                sum = sum + count[c];
                c++;
            }
            fraction[f] = (double) sum / trials;
        }

        for (int index = 1; index <= n + 2; index++) {
            if (fraction[index] > 0.50) {
                break;
            }

            System.out.println((index) + "\t" + count[index] + "\t" + fraction[index]);
        }
    }
}
