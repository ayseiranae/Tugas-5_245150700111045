public class Arithmetic {

    public static int addition(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public void simplify(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        System.out.println(numerator + "/" + denominator);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}