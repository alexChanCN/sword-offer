package ch2;

public class Q13 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] status = new boolean[rows][cols];
        return movingCount(threshold, rows, cols, 0, 0, status);
    }

    public int movingCount(int threshold, int rows, int cols, int i, int j, boolean[][] status) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || sum(i) + sum(j) > threshold || status[i][j])
            return 0;
        status[i][j] = true;
        return movingCount(threshold, rows, cols, i + 1, j, status) +
                movingCount(threshold, rows, cols, i - 1, j, status) +
                movingCount(threshold, rows, cols, i, j + 1, status) +
                movingCount(threshold, rows, cols, i, j - 1, status) + 1;

    }

    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Q13 q13 = new Q13();
        q13.movingCount(15, 20, 20);
    }
}
