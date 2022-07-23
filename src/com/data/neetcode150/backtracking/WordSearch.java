package com.data.neetcode150.backtracking;

import static com.data.neetcode150.backtracking.WordSearch.checkIfWord;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean exist(char[][] board, String word){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                   if (checkIfWord(board, i, j, word, 0)){
                       return true;
                    }

            }
        }
        return false;
    }

    public static boolean checkIfWord(char[][] board, int i, int j, String word, int index){
        if(index >= word.length()) return false;

        if(i >= board.length || j>= board[0].length || i<0 || j< 0){
            return false;
        }
        if(board[i][j] != word.charAt(index)){
            return false;
        }
        if(index == word.length()-1){
            return true;
        }
        board[i][j] += 100;
        index++;

        boolean exist = checkIfWord(board, i+1, j, word, index) ||
        checkIfWord(board, i-1, j, word, index) ||
        checkIfWord(board, i, j+1, word, index) ||
        checkIfWord(board, i, j-1, word, index);
        board[i][j] -= 100;

        return exist;
    }
}

