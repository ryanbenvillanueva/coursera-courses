/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Coursera User ID:  123456
 *  Last modified:     7/10/2019
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;
        double sqrRoot = Math
                .sqrt(Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2) +
                              (Math.cos(x1) * Math.cos(x2) *
                                      (Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2))));
        double arcsin = Math.asin(sqrRoot);
        double distance = 2 * r * arcsin;
        System.out.println(distance + " kilometers");
    }
}
