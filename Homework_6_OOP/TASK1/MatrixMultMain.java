package Homework_6_OOP.TASK1;

import java.util.Random;

public class MatrixMultMain {
    public static void main(String[] args) {
        int size = 10000;
        int[][] matrixA = generateRandomMatrix(size, size);
        int[][] matrixB = generateRandomMatrix(size, size);


        int[][] result = multiplyMatrices(matrixA, matrixB);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Werte von 0 bis 9
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Number of columns in A must be equal to number of rows in B");
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                DotProductThread[] threads = new DotProductThread[colsA];
                for (int k = 0; k < colsA; k++) {
                    threads[k] = new DotProductThread(a[i][k], b[k][j]);
                    threads[k].run();
                }
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    try {
                        threads[k].join();
                        sum += threads[k].getDot();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
