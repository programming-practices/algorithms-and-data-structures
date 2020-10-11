package other;

// Sources: https://ru.stackoverflow.com/questions/549654/java-рекурсия-задача-на-сообразительность

public class PathFinder {
    public static void main(String args[]) {
        int mat[][] = {
                {03, 13, 15, 28, 30},
                {40, 51, 52, 29, 30},
                {28, 10, 53, 54, 53},
                {53, 12, 55, 53, 60},
                {70, 62, 56, 20, 80},
                {80, 81, 90, 95, 100}};
        System.out.println(shorterPath(mat));
    }

    public static int shorterPath(int[][] mat) {
        return shorterPath(mat, 0, 0, 0, 0);
    }

    public static int shorterPath(int[][] mat, int i, int j, int counter, int preval) {
        if (!isValid(mat, i, j) || preval >= mat[i][j])
            return mat.length * mat[0].length * 2;

        if (i == mat.length - 1 && j == mat[0].length - 1) {
            counter++;
            return counter;
        } else {
            int a = shorterPath(mat, i + 1, j, counter + 1, mat[i][j]);
            int b = shorterPath(mat, i - 1, j, counter + 1, mat[i][j]);
            int c = shorterPath(mat, i, j + 1, counter + 1, mat[i][j]);
            int d = shorterPath(mat, i, j - 1, counter + 1, mat[i][j]);

            if (a <= b && a <= c && a <= d)
                return a;
            if (b <= a && b <= c && b <= d)
                return b;
            if (c <= a && c <= b && c <= d)
                return c;
            return d;
        }

    }

    public static boolean isValid(int[][] a, int i, int j) {
        if (i >= 0 && i <= a.length - 1 && j >= 0 && j <= a[0].length - 1)
            return true;
        else return false;
    }
}
