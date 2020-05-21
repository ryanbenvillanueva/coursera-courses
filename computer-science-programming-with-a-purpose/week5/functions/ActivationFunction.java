/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Problem Assignment: Week 5 - Functions
 *  Last modified:     May 21, 2020
 **************************************************************************** */

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        return ((Double.isNaN(x)) ? Double.NaN : (x < 0) ? 0.0 : (x == 0) ? 0.5 : 1);
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return (Double.isNaN(x)) ? Double.NaN : 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        return (Double.isNaN(x)) ? Double.NaN :
               (x == Double.POSITIVE_INFINITY) ? 1.0 :
               (x == Double.MAX_VALUE) ? 1.0 :
               (x == -Double.MAX_VALUE) ? -1.0 :
               (x == Double.NEGATIVE_INFINITY) ? -1.0 :
               (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        return (Double.isNaN(x)) ? Double.NaN :
               (x == Double.POSITIVE_INFINITY) ? 1.0 :
               (x == Double.NEGATIVE_INFINITY) ? -1.0 : x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        return (Double.isNaN(x)) ? Double.NaN :
               (x <= -2) ? -1 :
               (x > -2 && x < 0) ? x + (Math.pow(x, 2) / 4) :
               (x >= 0 && x < 2) ? x - (Math.pow(x, 2) / 4) : 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));
        StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ") = " + tanh(x));
        StdOut.println(" softsign(" + x + ") = " + softsign(x));
        StdOut.println("     sqnl(" + x + ") = " + sqnl(x));
    }
}
