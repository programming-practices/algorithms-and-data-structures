package data_structures.matrix;

import java.util.Random;

/**
 * Operation on matrix
 *
 * @author TRL
 */
public final class MatrixOperations {
    private static Random random = new Random();

    private MatrixOperations() { }

    /**
     * Filling in matrix
     *
     * @return int[][] matrix
     */
    public static void fillingMatrix(int[][] matrix) {
        int value = 0;
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = new int[matrix[row].length];
            for (int cell = 0; cell < matrix[row].length; cell++) {
                matrix[row][cell] = value;
                value++;
            }
        }
    }

    /**
     * Filling in matrix
     *
     * @param boundOfRandomNumbers the upper bound (exclusive) for random numbers.  Must be positive.
     * @return int[][] matrix
     */
    public static void fillingMatrix(int[][] matrix, int boundOfRandomNumbers) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = new int[matrix[row].length];
            for (int cell = 0; cell < matrix[row].length; cell++) {
                matrix[row][cell] = random.nextInt(boundOfRandomNumbers);
            }
        }
    }

    /**
     * Multiple matrix for Vector
     *
     * @return if matrix row length equal vector length return int[] result,
     * else return int[] empty.
     */
    public static int[] multipleMatrixForVector(int[][] matrix, int[] vector) {
        int[] result = new int[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == vector.length) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[i] += matrix[i][j] * vector[j];
                }
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    /**
     * Multiple matrix for matrix
     *
     * @return int[][] resultMatrix if matrixA row.length equal
     * matrixB column.length, else return int[][] resultMatrix empty
     */
    public static int[][] multipleMatrixForMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] matrixResult = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                for (int l = 0; l < matrixB.length; l++) {
                    matrixResult[i][j] += matrixA[i][l] * matrixB[l][j];
                }
            }
        }
        return matrixResult;
    }

    /**
     * Show how the matrix is multiplied by the matrix
     * показать как матрица умножается на матрицу
     */
    public static void showMultipliedMatrixForMatrix() {
        String[][] matrixA = {
                {"a11", "a12", "a13",},
                {"a21", "a22", "a23"},
                {"a31", "a32", "a33"}
        };

        String[][] matrixB = {
                {"b11", "b12", "b13",},
                {"b21", "b22", "b23"},
                {"b31", "b32", "b33"}
        };

        System.out.println("MatrixA");
        showMatrix(matrixA);

        System.out.println("\nMatrixB");
        showMatrix(matrixB);

        System.out.println();
        System.out.println("Matrix result:");
        String[][] result = new String[matrixA.length][matrixA.length];
        for (int rowMA = 0; rowMA < matrixA.length; rowMA++) {      // rowMA -> index row matrixA
            for (int columnMB = 0; columnMB < matrixB.length; columnMB++) {     // columnMD -> index column matrixB
                StringBuffer cellResult = new StringBuffer();
                for (int cellMA = 0; cellMA < matrixA[rowMA].length; cellMA++) {        // cellMA -> index cell matrixA
                    if (cellMA < 2) {
                        cellResult.append(matrixA[rowMA][cellMA] + " * " + matrixB[cellMA][columnMB] + " + ");
                    } else {
                        cellResult.append(matrixA[rowMA][cellMA] + " * " + matrixB[cellMA][columnMB] + "  ");
                    }
                }
                result[rowMA][columnMB] = cellResult.toString() + "   ";
            }
        }
        showMatrix(result);
    }

    /**
     * Show matrix
     * @param matrix matrix to show
     */
    public static void showMatrix(int[][] matrix) {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < matrix.length; row++) {
            for (int cell = 0; cell < matrix[row].length; cell++) {
                if (cell != 0) {
                    result.append(matrix[row][cell] + " ");
                } else {
                    result.append("      " + matrix[row][cell] + " ");
                }
            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }

    /**
     * Show matrix
     * @param matrix matrix to show
     */
    public static <T> void showMatrix(T[][] matrix) {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < matrix.length; row++) {
            for (int cell = 0; cell < matrix[row].length; cell++) {
                if (cell != 0) {
                    result.append(matrix[row][cell] + " ");
                } else {
                    result.append("      " + matrix[row][cell] + " ");
                }
            }
            result.append("\n");
        }
        System.out.println(result.toString());
    }
}
