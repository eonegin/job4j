package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int j;
        int k;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1])
                result = false;
        }
        for (k = data.length - 1, j = 0; k > 0; k--, j++){
            if (data[k][j] != data[k - 1][j + 1])
                result = false;
                }
        return result;
    }
}
