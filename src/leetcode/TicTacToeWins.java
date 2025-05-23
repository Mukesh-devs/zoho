package leetcode;
public class TicTacToeWins {
    int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
    Wins wins = new Wins();
//    System.out.println(wins.tictactoe(moves));
}

class Wins {
    char[][] game;
    public String tictactoe(int[][] moves) {

        int count = 0;
        game = new char[3][3];
        for ( int i = 0; i < moves.length; i++ ) {
            if ( i % 2 == 0) {
                game[moves[i][0]][moves[i][1]] = 'X';
            }
            else {
                game[moves[i][0]][moves[i][1]] = 'O';
            }
            count++;
        }

        for ( int row = 0; row < 3; row++ ) {
            if ( game[0][row] != '\0' && vertical(row,game,game[0][row] )) {
                return game[0][row] == 'X' ? "A" : "B";
            }
        }
        for ( int col = 0; col < 3; col++ ) {
            if ( game[col][0] != '\0' && horizontal(col,game,game[col][0] )) {
                return game[col][0] == 'X' ? "A" : "B";
            }
        }
        if ( game[0][0] != '\0' && diagonalA(game,game[0][0]) ) {
            return game[0][0] == 'X' ? "A" : "B";
        }
        if ( game[0][2] != '\0' && diagonalB(game,game[0][2]) ) {
            return game[0][2] == 'X' ? "A" : "B";
        }
        return 9 - count > 0 ? "Pending" : "Draw";
    }

    public boolean vertical(int index, char[][] game, char player) {
        for ( int i = 0; i < 3; i++ ) {
            if ( game[i][index] != player) {
                return false;
            }
        }
        return true;
    }

    public boolean horizontal(int index, char[][] game, char player) {
        for ( int i = 0; i < 3; i++ ) {
            if ( game[index][i] != player) {
                return false;
            }
        }
        return true;
    }

    public boolean diagonalA(char[][] game, char player) {
        for (int i = 0; i < 3; i++) {
            if (game[i][i] != player) {
                return false;
            }
        }
        return true;
    }

    public boolean diagonalB(char[][] game, char player) {
        for (int i = 0; i < 3; i++) {
            if (game[i][2 - i] != player) {
                return false;
            }
        }
        return true;
    }
}
