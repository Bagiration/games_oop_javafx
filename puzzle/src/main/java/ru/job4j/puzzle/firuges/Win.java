package ru.job4j.puzzle.firuges;

public class Win {
    /*public static boolean check(int[][] board) {
        boolean rsl = true;
        return rsl;
    }*/

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (checkHor(board, i) || checkVert(board, i) ) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean checkHor(int[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVert(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }


}
