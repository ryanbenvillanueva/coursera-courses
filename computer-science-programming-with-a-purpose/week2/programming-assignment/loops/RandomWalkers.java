/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: 2 - Loops
 *  Last modified:     October 18, 2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int steps = 0;
        int stepsSum = 0;
        int manhattanDistance = 0;
        int randomStep;
        double average = 0;

        for (int i = 1; i <= trials; i++) {
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
                manhattanDistance = Math.abs(0 - x) + Math.abs(0 - y);
                steps++;
            }
            stepsSum += steps;

        }
        average = (double) stepsSum / trials;
        System.out.println("average number of steps = " + average);
    }
}
