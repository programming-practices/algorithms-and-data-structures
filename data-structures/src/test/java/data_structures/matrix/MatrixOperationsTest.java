package data_structures.matrix;

import org.junit.Assert;
import org.junit.Test;

public class MatrixOperationsTest {
// ====================================================================================================================
    int lenN123 = 1;
    int lenM123 = 2;
    int lenK123 = 3;
    int[][] matrixA123 = new int[lenN123][lenM123];
    {           // 1  2
        matrixA123[0][0] = 1;
        matrixA123[0][1] = 2;
    }
    int[][] matrixB123 = new int[lenM123][lenK123];
    {           // 2  3
        matrixB123[0][0] = 1;
        matrixB123[0][1] = 2;
        matrixB123[0][2] = 3;
        matrixB123[1][0] = 4;
        matrixB123[1][1] = 5;
        matrixB123[1][2] = 6;
    }
    int[][] matrixResult123 = new int[lenN123][lenK123];
    {           //      1 3
        matrixResult123[0][0] = 9;
        matrixResult123[0][1] = 12;
        matrixResult123[0][2] = 15;
    }
// =====================================================================================================================
    int lenN234 = 2;
    int lenM234 = 3;
    int lenK234 = 4;
    int[][] matrixA234 = new int[lenN234][lenM234];
    {           // 2 3
        matrixA234[0][0] = 1;
        matrixA234[0][1] = 2;
        matrixA234[0][2] = 3;
        matrixA234[1][0] = 4;
        matrixA234[1][1] = 5;
        matrixA234[1][2] = 6;
    }
    int[][] matrixB234 = new int[lenM234][lenK234];
    {               // 3 4
        matrixB234[0][0] = 1;
        matrixB234[0][1] = 2;
        matrixB234[0][2] = 3;
        matrixB234[0][3] = 4;
        matrixB234[1][0] = 5;
        matrixB234[1][1] = 6;
        matrixB234[1][2] = 7;
        matrixB234[1][3] = 8;
        matrixB234[2][0] = 9;
        matrixB234[2][1] = 10;
        matrixB234[2][2] = 11;
        matrixB234[2][3] = 12;
    }
    int[][] matrixResult234 = new int[lenN234][lenK234];
    {                // 2  4
        matrixResult234[0][0] = 38;
        matrixResult234[0][1] = 44;
        matrixResult234[0][2] = 50;
        matrixResult234[0][3] = 56;
        matrixResult234[1][0] = 83;
        matrixResult234[1][1] = 98;
        matrixResult234[1][2] = 113;
        matrixResult234[1][3] = 128;
    }
// =====================================================================================================================
    int lenN333 = 3;
    int lenM333 = 3;
    int lenK333 = 3;
    int[][] matrixA333 = new int[lenN333][lenM333];
    {           // 3  3
        matrixA333[0][0] = 1;
        matrixA333[0][1] = 2;
        matrixA333[0][2] = 3;
        matrixA333[1][0] = 4;
        matrixA333[1][1] = 5;
        matrixA333[1][2] = 6;
        matrixA333[2][0] = 7;
        matrixA333[2][1] = 8;
        matrixA333[2][2] = 9;
    }
    int[][] matrixB333 = new int[lenM333][lenK333];
    {           // 3  3
        matrixB333[0][0] = 1;
        matrixB333[0][1] = 2;
        matrixB333[0][2] = 3;
        matrixB333[1][0] = 4;
        matrixB333[1][1] = 5;
        matrixB333[1][2] = 6;
        matrixB333[2][0] = 7;
        matrixB333[2][0] = 8;
        matrixB333[2][0] = 9;
    }
    // TODO no funciona el test, hay que buscar la rason por que no funccion.
    int[][] matrixResult333 = new int[lenN333][lenK333];
    {           // 3  3
        matrixResult333[0][0] = 36;
        matrixResult333[0][1] = 12;
        matrixResult333[0][2] = 15;
        matrixResult333[1][0] = 78;
        matrixResult333[1][1] = 33;
        matrixResult333[1][2] = 42;
        matrixResult333[2][0] = 120;
        matrixResult333[2][1] = 54;
        matrixResult333[2][2] = 69;

//        matrixResult333[0][0] = 30;
//        matrixResult333[0][1] = 36;
//        matrixResult333[0][2] = 42;
//        matrixResult333[1][0] = 66;
//        matrixResult333[1][1] = 81;
//        matrixResult333[1][2] = 96;
//        matrixResult333[2][0] = 102;
//        matrixResult333[2][0] = 126;
//        matrixResult333[2][0] = 150;
    }
// =====================================================================================================================

    @Test
    public void multipleMatrixForVector() {
    }

    @Test
    public void multipleMatrixForMatrix123() {
        Assert.assertArrayEquals(matrixResult123, MatrixOperations.multipleMatrixForMatrix(matrixA123, matrixB123));
    }
    @Test
    public void multipleMatrixForMatrix234() {
        Assert.assertArrayEquals(matrixResult234, MatrixOperations.multipleMatrixForMatrix(matrixA234, matrixB234));
    }
    @Test
    public void multipleMatrixForMatrix333() {
        Assert.assertArrayEquals(matrixResult333, MatrixOperations.multipleMatrixForMatrix(matrixA333, matrixB333));
    }
}