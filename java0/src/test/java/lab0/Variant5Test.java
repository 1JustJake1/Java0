package lab0;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class Variant5Test {

    @Test
    public void testTask1() {
        assertEquals(Variant5.task1(13, 5), 3);
        assertEquals(Variant5.task1(20, 3), 2);
        assertEquals(Variant5.task1(30, 10), 0);
    }

    @Test
    public void testTask2() {
        assertTrue(Variant5.task2(3, -3), "A > 0 or B < -2 should be true");
        assertFalse(Variant5.task2(0, -3), "A > 0 or B < -2 should be false");
        assertFalse(Variant5.task2(2, -2), "A > 0 or B < -2 should be false");
    }

    @Test
    public void testTask3() {
        int[] counts = Variant5.task3(3, -1, -2);
        assertEquals(counts[0], 1);
        assertEquals(counts[1], 2);

        counts = Variant5.task3(1, 1, 1);
        assertEquals(counts[0], 3);
        assertEquals(counts[1], 0);
    }

    @Test
    public void testTask4() {
        assertEquals(Variant5.task4(1, 5, 3), 8.0);
        assertEquals(Variant5.task4(2, 5, 3), 2.0);
        assertEquals(Variant5.task4(3, 5, 3), 15.0);
        assertEquals(Variant5.task4(4, 5, 2), 2.5);
    }

    @Test
    public void testTask5() {
        double[] costs = Variant5.task5(50);
        assertEquals(costs.length, 10);
        assertEquals(costs[0], 5.0);
        assertEquals(costs[4], 25.0);
        assertEquals(costs[9], 50.0);
    }

    @Test
    public void testTask6() {
        assertEquals(Variant5.task6(16), 4);
        assertEquals(Variant5.task6(32), 5);
        assertEquals(Variant5.task6(2), 1);
    }

    @Test
    public void testTask7() {
        int[] fibonacci = Variant5.task7(7);
        assertEquals(fibonacci.length, 7);
        assertEquals(fibonacci[0], 1);
        assertEquals(fibonacci[6], 13);
    }

    @Test
    public void testTask8() {
        int M = 3;
        int N = 4;
        int D = 2;
        int[] firstColumn = {1, 2, 3};

        int[][] matrix = Variant5.task8(M, N, D, firstColumn);

        assertEquals(matrix[0][0], 1);
        assertEquals(matrix[1][0], 2);
        assertEquals(matrix[2][0], 3);

        // Перевірка, чи кожен наступний стовпець є арифметичною прогресією
        assertEquals(matrix[0][1], 3);
        assertEquals(matrix[0][2], 5);
        assertEquals(matrix[0][3], 7);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInputForTask8() {
        int M = -2;
        int N = 3;
        int D = 5;
        int[] firstColumn = {1, 2};

        Variant5.task8(M, N, D, firstColumn);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyMatrix() {
        int M = 0;
        int N = 3;
        int D = 5;
        int[] firstColumn = {};

        Variant5.task8(M, N, D, firstColumn);
    }
}
