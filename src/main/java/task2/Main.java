package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver();

        double a = 2.0, b = -4.0, c = -2.0;
        double[] roots = solver.solveQuadratic(a, b, c);
        System.out.println("Roots of the equation are: " + Arrays.toString(roots));
    }
}
