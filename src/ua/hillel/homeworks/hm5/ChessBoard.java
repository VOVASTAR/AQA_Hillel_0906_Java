package ua.hillel.homeworks.hm5;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int k = 0; k < board[i].length; k++) {
                if (i%2==k%2) {
                    board[i][k] = "Б ";
                } else {
                    board[i][k] = "Ч ";
                }
                System.out.print(board[i][k]);
            }
        }
    }
}

