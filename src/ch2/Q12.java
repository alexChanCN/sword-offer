package ch2;

public class Q12 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] status = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPath(matrix, rows, cols, str, i, j, 0, status))
                    return true;
            }
        }
        return false;
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str, int i, int j, int count, boolean[] status) {
        int index = cols * i + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || status[index] || str[count] != matrix[index])
            return false;

        if (count == str.length - 1)
            return true;

        status[index] = true;
        if (hasPath(matrix, rows, cols, str, i + 1, j, count + 1, status)
                || hasPath(matrix, rows, cols, str, i - 1, j, count + 1, status)
                || hasPath(matrix, rows, cols, str, i, j + 1, count + 1, status)
                || hasPath(matrix, rows, cols, str, i , j - 1, count + 1, status))
            return true;
        status[index] = false;
        return false;
    }
}
