package data_structures.matrix.a1;

public class MatrixOperations {
    private static final String MATRIX_MULTIPLICATION_ERROR_MSG = "";

    public static Matrix multiply(Matrix matrix1, Matrix matrix) throws MatrixException {

        if (matrix1.getDimension().getColumns() != matrix.getDimension().getRows())
            throw new MatrixException(MATRIX_MULTIPLICATION_ERROR_MSG);

        Matrix retVal = new Matrix(matrix1.getDimension().getRows(), matrix.getDimension().getColumns(), matrix1.getName() + " x " + matrix.getName());


        for (int i = 0; i < matrix1.getDimension().getRows(); i++) {
            for (int j = 0; j < matrix.getDimension().getColumns(); j++) {
                retVal.getEntries()[i][j] = sum(arrayProduct(matrix1.getEntries()[i], getColumnMatrix(matrix, j)));
            }
        }

        return retVal;
    }

    private static double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    private static double[] arrayProduct(double[] arr1, double[] arr2) throws MatrixException {
        if (arr1.length != arr2.length) throw new MatrixException("Array lengths must be the same");
        double[] retVal = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            retVal[i] = arr1[i] * arr2[i];
        }

        return retVal;
    }


    private static double[] getColumnMatrix(Matrix matrix, int col) {
        double[] ret = new double[matrix.getDimension().getRows()];
        for (int i = 0; i < matrix.getDimension().getRows(); i++) {
            ret[i] = matrix.getEntries()[i][col];
        }
        return ret;
    }
}
