/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 2 - Loops
 *  Last modified:     October 15, 2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        int manhattanDistance = 0;
        int randomStep;

        System.out.println("(" + x + ", " + y + ")");
        while (manhattanDistance < r) {
            randomStep = (int) (Math.random() * 4);
            if (randomStep == 0) {
                x = x + 1;
            }
            else if (randomStep == 1) {
                x = x - 1;
            }
            else if (randomStep == 2) {
                y = y + 1;
            }
            else {
                y = y - 1;
            }
            System.out.println("(" + x + ", " + y + ")");
            manhattanDistance = Math.abs(0 - x) + Math.abs(0 - y);
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
