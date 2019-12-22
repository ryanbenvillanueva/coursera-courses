/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 3 - Arrays
 *  Last modified:     December 22, 2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length;
        int[] a = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                s[i] = 0;
            }
            else if (i == 1) {
                s[i] = a[i];
            }
            else {
                s[i] = s[i - 1] + a[i];
            }
        }


        for (int i = 1; i <= m; i++) {
            int r = (int) (Math.random() * s[n - 1]);
            int index = 1;
            for (int j = 1; j < n; j++) {
                if (r <= s[j - 1] && r < s[j]) {
                    index = j;
                    break;
                }
            }
            System.out.print(index + " ");
        }
    }
}





