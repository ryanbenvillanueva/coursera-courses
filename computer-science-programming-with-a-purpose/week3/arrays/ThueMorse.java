/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 3 - Arrays
 *  Last modified:     December 22, 2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String thue = "0";
        String morse = "1";

        for (int i = 1; i < n; i *= 2) {

            String t = thue;
            String m = morse;

            thue += m;
            morse += t;
        }

        int number = Integer.parseInt(morse);
        int[] seq = new int[morse.length()];

        int k = 0;
        while (number != 0 && (k < morse.length())) {
            int digit = number % 10;
            seq[k] = digit;
            number /= 10;
            k++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (seq[i] != seq[j]) {
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
