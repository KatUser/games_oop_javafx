package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1
                    && (checkHorizontal(board, i)
                    || checkVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int column) {
        for (int[] ints : board) {
            if (ints[column] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 1) {
                return false;
            }
        }
        return true;
    }
}
