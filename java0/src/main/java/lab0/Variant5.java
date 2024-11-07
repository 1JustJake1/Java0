package lab0;

public class Variant5 {

    public static int task1(int A, int B) {
        if (B == 0) {
            throw new IllegalArgumentException("B не може бути 0");
        }
        return A % B;
    }

    public static boolean task2(int A, int B) {
        return (A > 0) && (B < -2);
    }

    public static int[] task3(int num1, int num2, int num3) {
        int positiveCount = 0;
        int negativeCount = 0;

        if (num1 > 0) positiveCount++;
        if (num2 > 0) positiveCount++;
        if (num3 > 0) positiveCount++;

        if (num1 < 0) negativeCount++;
        if (num2 < 0) negativeCount++;
        if (num3 < 0) negativeCount++;

        return new int[]{positiveCount, negativeCount};
    }

    public static double task4(int N, double A, double B) {
        switch (N) {
            case 1: return A + B;
            case 2: return A - B;
            case 3: return A * B;
            case 4: return A / B;
            default: throw new IllegalArgumentException("Невідомий номер операції");
        }
    }

    public static double[] task5(double pricePerKg) {
        double[] costs = new double[10];
        for (int i = 1; i <= 10; i++) {
            costs[i - 1] = pricePerKg * i / 10.0;
        }
        return costs;
    }

    public static int task6(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("N має бути більше 0");
        }
        int K = 0;
        while (N > 1) {
            if (N % 2 != 0) {
                throw new IllegalArgumentException("N має бути степенем 2");
            }
            N /= 2;
            K++;
        }
        return K;
    }

    public static int[] task7(int N) {
        int[] fibonacci = new int[N];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int[][] task8(int M, int N, int D, int[] firstColumn) {
        if (M <= 0 || N <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive.");
        }
        if (firstColumn == null || firstColumn.length != M) {
            throw new IllegalArgumentException("Length of firstColumn must be equal to M and cannot be null.");
        }

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            matrix[i][0] = firstColumn[i];
            for (int j = 1; j < N; j++) {
                matrix[i][j] = matrix[i][j - 1] + D;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        System.out.println("task1: " + task1(13, 5));

        System.out.println("task2: " + task2(3, -3));

        int[] counts = task3(3, -1, -2);
        System.out.println("task3: Positive: " + counts[0] + ", Negative: " + counts[1]);

        System.out.println("task4: " + task4(1, 4.5, 2.3));

        double[] costs = task5(50);
        System.out.print("task5: ");
        for (double cost : costs) {
            System.out.print(cost + " ");
        }
        System.out.println();

        System.out.println("task6: " + task6(16));

        int[] fibonacci = task7(7);
        System.out.print("task7: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] firstColumn = {1, 2, 3};
        int[][] matrix = task8(3, 4, 2, firstColumn);
        System.out.println("task8: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}


