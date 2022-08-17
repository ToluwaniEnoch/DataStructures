package com.data.neetcode150.backtracking;

import java.util.HashSet;
import java.util.Set;

import static com.data.neetcode150.backtracking.WordSearch.checkIfWord;

public class WordSearch {
    public static void main(String[] args) {
        //char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E', 'E'}};
        //String word = "ABCCED";

//        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
//        String word = "ABCB";

        char[][] board = {{'C', 'A', 'A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}};
        String word = "AAB";
        System.out.println(existB(board, word));
    }

    public static boolean existB(char[][] board, String word) {
        Set<String> visited = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board, word, i, j, 0, new HashSet<>(visited)) == true) return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word, int i, int j, int n, Set<String> visited){

        String current =  String.valueOf(i) + String.valueOf(j);
        if(i >= 0 && i<board.length && j>=0 && j<board[0].length &&
                board[i][j] == word.charAt(n) && !visited.contains(current)){
            visited.add(current);
            if(n == word.length()-1 && board[i][j] == word.charAt(word.length() - 1))
                return true;

            return dfs(board, word, i+1, j, n+1, new HashSet<>(visited)) ||
                    dfs(board, word, i-1, j, n+1, new HashSet<>(visited)) ||
                    dfs(board, word, i, j+1, n+1, new HashSet<>(visited)) ||
                    dfs(board, word, i, j-1, n+1, new HashSet<>(visited)) ;
        }

        return false;

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

