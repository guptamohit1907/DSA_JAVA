package com.leetcode.java.dsacode;

//package com.leetcode.java;
//
class TicTacToe {

    private int[][] board;
    private int n;

    public TicTacToe(int n) {
        board = new int[n][n];
        this.n = n;
    }

    public int move(int row, int col, int player) {
        board[row][col] = player;
        // check if the player wins
        if ((checkRow(row, player)) ||
            (checkColumn(col, player)) ||
            (row == col && checkDiagonal(player)) ||
            (col == n - row - 1 && checkAntiDiagonal(player))) {
            return player;
        }
        // No one wins
        return 0;
    }

    private boolean checkDiagonal(int player) {
        for (int row = 0; row < n; row++) {
            if (board[row][row] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkAntiDiagonal(int player) {
        for (int row = 0; row < n; row++) {
            if (board[row][n - row - 1] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int col, int player) {
        for (int row = 0; row < n; row++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean checkRow(int row, int player) {
        for (int col = 0; col < n; col++) {
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }
}


//class TicTacToe {
//    private int[] rows;
//    private int[] columns;
//    private int diagonalSum;
//    private int antiDiagonalSum;
//    public TicTacToe(int n) {
//        rows = new int[n];
//        columns = new int[n];
//    }
//    public int move(int row, int col, int player) {
//        int player_value = (player == 1) ? 1 : -1;
//        if (row == col){
//            diagonalSum += player_value;
//        } if (col == (columns.length - 1 - row)){
//            antiDiagonalSum += player_value;
//        }
//        rows[row] += player_value;
//        columns[col] += player_value;
//        int size = rows.length;
//        if ((Math.abs(diagonalSum) == size) ||
//                (Math.abs(antiDiagonalSum) == size) ||
//                (Math.abs(rows[row]) == size) ||
//                (Math.abs(columns[col]) == size)){
//            return player;
//        }
//        return 0;
//    }
//}