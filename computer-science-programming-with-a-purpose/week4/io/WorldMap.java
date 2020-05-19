/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: Week 4 - Input and Output
 *  Last modified:     May 18, 2020
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        String[] data = StdIn.readAllStrings();

        int index = 0;
        int start = index + 2;
        int end = start + Integer.parseInt(data[index + 1]);
        int xIndex = start;
        int yIndex = start + 1;
        // while (index <= data.length) {
        for (int i = start; i < end; i++) {
            double x = Double.parseDouble(data[xIndex]);
            double y = Double.parseDouble(data[yIndex]);
            xIndex += 2;
            yIndex += 2;
            StdOut.println("x: " + x + "\ty: " + y);
        }
        StdOut.println(data[end]);

        // }
    }
}
