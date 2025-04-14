import java.util.Scanner;

public class ArithmeticMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Arithmetic arith = new Arithmetic();

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        System.out.println("Addition (static): " + Arithmetic.addition(a, b));
        System.out.println("Subtraction (static): " + Arithmetic.subtraction(a, b));
        System.out.println("Multiplication (non-static): " + arith.multiplication(a, b));
        System.out.println("Division (non-static): " + arith.division(a, b));

        System.out.print("\nEnter numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = input.nextInt();

        arith.simplify(numerator, denominator);
    }
}
