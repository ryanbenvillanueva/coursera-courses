/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 3 - Arrays
 *  Last modified:     December 22, 2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] seq = new int[n];
        seq[0] = 0;

        for (int i = 1; i < n; i++) {
            int sum = 0;
            int decimal = i;
            while (decimal > 0) {
                if (decimal % 2 != 0) {
                    sum++;
                }
                decimal /= 2;
            }
            if (sum % 2 == 0) {
                seq[i] = 0;
            }
            else {
                seq[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (seq[i] != (seq[j])) {
                    System.out.print("-  ");
                }
                else {
                    System.out.print("+  ");
                }
            }
            System.out.println();
        }
    }
}
