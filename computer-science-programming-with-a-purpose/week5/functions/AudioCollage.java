/* *****************************************************************************
 *  Name:              Ryan Ben S. Villanueva
 *  Programming Assignment: Week 5 - Functions
 *  Last modified:     May 22, 2020
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] array = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i] * alpha;
        }
        return array;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] array = new double[a.length];

        for (int i = 0, j = a.length - 1; i < a.length && j >= 0; i++, j--) {
            array[j] = a[i];
        }

        return array;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] array = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            array[a.length + i] = b[i];
        }

        return array;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int length = Math.max(a.length, b.length);
        int minLength = Math.min(a.length, b.length);
        double[] array = new double[length];
        double[] shortArr = new double[length];
        if (a.length < b.length) {
            for (int i = 0; i < minLength; i++) {
                shortArr[i] = a[i];
            }

            for (int i = 0; i < length; i++) {
                array[i] = shortArr[i] + b[i];
            }
        }
        else if (b.length < a.length) {
            for (int i = 0; i < minLength; i++) {
                shortArr[i] = b[i];
            }

            for (int i = 0; i < length; i++) {
                array[i] = shortArr[i] + a[i];
            }
        }
        else {
            for (int i = 0; i < length; i++) {
                array[i] = a[i] + b[i];
            }
        }

        return array;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int length = (int) Math.floor(a.length / alpha);
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = a[(int) Math.floor(i * alpha)];
        }
        return array;
    }

    // // Creates an audio collage and plays it on standard audio.
    public static void main(String[] args) {
        double[] a = StdAudio.read("beatbox.wav");
        double[] b = StdAudio.read("buzzer.wav");
        double[] c = StdAudio.read("chimes.wav");
        double[] d = StdAudio.read("cow.wav");
        double[] e = StdAudio.read("harp.wav");

        StdAudio.play(AudioCollage.amplify(a, 0.5));
        StdAudio.play(AudioCollage.reverse(b));
        StdAudio.play(AudioCollage.merge(c, d));
        StdAudio.play(AudioCollage.mix(e, a));
        StdAudio.play(AudioCollage.changeSpeed(b, 0.5));
    }
}
