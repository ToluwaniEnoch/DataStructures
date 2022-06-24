package com.data.neetcode150.graph;

public class SurroundingRegions {
    public static void main(String[] args) {

    }
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;



        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i==0 || i==board.length-1 || j==0 || j==board[i].length -1){
                    if(board[i][j] == 'O'){
                        explore(i, j, board);
                    }
                }
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static void explore(int i, int j, char[][] board){
        if(i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j]== 'O'){
            board[i][j] = 'T';

            explore(i+1, j, board);
            explore(i-1, j, board);
            explore(i, j+1, board);
            explore(i, j-1, board);

        }



    }

}
