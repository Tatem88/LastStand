package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.AssertArrayEquals.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class EquationSolver {
    private EquationSolver solver;

    @BeforeEach
    void setUp() {
        solver = new EquationSolver();
    }

    @Test
    @DisplayName("Test positive discriminant")
    void testPositiveDiscriminant() {
        double[] expected = {1.0, -3.0};
        assertArrayEquals(expected, solver.solveQuadratic(2.0, -4.0, -2.0), "Roots are incorrect");
    }

    @Test
    @DisplayName("Test zero discriminant")
    void testZeroDiscriminant() {
        double[] expected = {1.0};
        assertArrayEquals(expected, solver.solveQuadratic(2.0, -4.0, 2.0), "Roots are incorrect");
    }

    @Test
    @DisplayName("Test negative discriminant")
    void testNegativeDiscriminant() {
        double[] expected = new double[0];
        assertArrayEquals(expected, solver.solveQuadratic(2.0, 2.0, 2.0), "Roots are incorrect");
    }
}

