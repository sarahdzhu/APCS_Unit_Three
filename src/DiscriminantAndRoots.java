public class DiscriminantAndRoots {

    // Create the method roots in the space below.
    public static String roots(int a, int b, int c) {
        int d = (int) (Math.pow(b, 2)) - (4 * a * c);
        String result=a+"x^2 "+"+ "+b+"x + "+c;
        if (d == 0) {
            return result+" has 1 real root";
        } else if (d < 0) {
            return result+" has 2 imaginary roots";
        } else
            return result+" has 2 real roots";

    }
}

        // update this line so that it returns properly formatted output




