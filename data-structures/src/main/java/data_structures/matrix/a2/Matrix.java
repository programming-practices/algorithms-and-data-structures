package data_structures.matrix.a2;

import static data_structures.matrix.MatrixOperations.*;

// Sources:
//      1. https://www.youtube.com/watch?v=lN8L7G7iO1c
//      2. https://www.youtube.com/watch?v=BqZs6Iwc1SM
public class Matrix {
    public static void main(String[] args) {
// ------------------------------------ https://www.youtube.com/watch?v=lN8L7G7iO1c ------------------------------------
        // --------------------- Ymnozenia matricu na vektor
        // Length for matrix and vector
//        int lengthMV = 3;
//        int lengthMV = 10;
//        int length = 10_000;

        // Create and filling in matrix
//        int[][] matrix = new int[lengthMV][lengthMV];
//        fillingMatrix(matrix,  20);

        // Create and filling in vector
//        int[] vectro = new int[lengthMV];
//        fillingVector(vectro, 10);

        // Show matrix
//        showMatrix(matrix);
        // Show vector
//        showVector(vectro);

        // Multiple matrix for vector
//        int[] resultMV= multipleMatrixForVector(matrix, vectro);

        // Show result
//        showVector(resultMV, "Result");

// ---------------------------------- https://www.youtube.com/watch?v=BqZs6Iwc1SM --------------------------------------
        // --------------------- Ymnozenia matricu na matricy

        //      [n * m], [m * k]
        //      [n * k]
//        int lenN = 1;
//        int lenM = 2;
//        int lenK = 3;

//        int lenN = 3;
//        int lenM = 3;
//        int lenK = 3;

        int lenN = 2;
        int lenM = 3;
        int lenK = 4;

        // Create matrix
        int[][] matrixA = new int[lenN][lenM];
        int[][] matrixB = new int[lenM][lenK];
        int[][] matrixResult = new int[lenN][lenK];

        // Filling in matrixA
        fillingMatrix(matrixA,  20);
//        fillingMatrix(matrixA);

        // Filling in matrixB
        fillingMatrix(matrixB,  20);
//        fillingMatrix(matrixB);

        // Show matrixA
        System.out.println("matrixA:");
        showMatrix(matrixA);

        // Show matrixB
        System.out.println("matrixB:");
        showMatrix(matrixB);

        // Show index
//        System.out.println(matrixA.length + " * " + matrixA[0].length);
//        System.out.println(matrixB.length + " * " + matrixB[0].length);
//        System.out.println(matrixResult.length + " * " + matrixResult[0].length);

        // Multiple matrixA for matrixB
        matrixResult = multipleMatrixForMatrix(matrixA, matrixB);
        //      0 1 2       0 1 2
        //      3 4 5       3 4 5
        //      6 7 8       6 7 8
        // 0*0 + 1*3 + 2*6      0*1 + 1*4 + 2*7     0*2 + 1*5 + 2*8
        // 3*0 + 4*3 + 5*6      3*1 + 4*4 + 5*7     3*2 + 4*5 + 5*8
        // 6*0 + 7*3 + 8*6      6*1 + 7*4 + 8*7     6*2 + 7*5 + 8*8
        //                        15   42  69
        //                        18   54  90
        //                        21   66  111
        //      0 1         0 1 2
        //                  3 4 5
        // 0*0 + 1*3            0*1 + 1*4           0*2 + 1*5
        //                        3    4    5

        // Show result
        System.out.println("Result:");
        showMatrix(matrixResult);

//        showMultipliedMatrixForMatrix();

// ---------------------------------------------------------------------------------------------------------------------
    }
}
