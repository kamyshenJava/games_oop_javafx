package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return isHorizontal(board) || isVertical(board);
    }

    private static boolean isHorizontal(int[][] board) {
        int l = board.length;
        int is1 = 0;
        for (int[] r : board) {
            for (int i = 0; i < l; i++) {
                if (r[i] != 1) {
                    is1 = 0;
                    break;
                }
                is1++;
                if (is1 == l) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isVertical(int[][] board) {
        int l = board.length;
        int is1 = 0;
        for (int i = 0; i < l; i++) {
            for (int y = 0; y < l; y++) {
                if (board[y][i] != 1) {
                    is1 = 0;
                    break;
                }
                is1++;
                if (is1 == l) {
                    return true;
                }
            }
        }
        return false;
    }
}
