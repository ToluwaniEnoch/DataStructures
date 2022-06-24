package com.data.neetcode150.graph;
import java.util.*;


public class WallsAndGates {
    public static void main(String[] args) {
        int[][] rooms = {{2147483647,-1,0,2147483647},
                {2147483647,2147483647,2147483647,-1},
                {2147483647,-1,2147483647,-1},
                {0,-1,2147483647,2147483647}};
        wallsAndGates(rooms);

        for (int i = 0; i < rooms.length; i++)
        {
            System.out.println();
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
        }
    }
        public static void wallsAndGates(int[][] rooms) {
            if(rooms == null || rooms.length == 0) return;

            Set<List<Integer>> visited = new HashSet<>();
            Queue<List<Integer>> queue = new LinkedList();

            for(int i=0; i<rooms.length; i++){
                for(int j=0; j<rooms[0].length; j++){
                    // get all gates and store in queue
                    if(rooms[i][j] == 0 ){
                        queue.add(Arrays.asList(i,j));
                        visited.add(Arrays.asList(i,j));
                    }
                }
            }
            int distance = 0;
            //run a dfs from queue
            while(!queue.isEmpty()){
                int len = queue.size();
                for(int i =0; i<len; i++){
                    List<Integer> element = queue.remove();
                    int row = element.get(0);
                    int col = element.get(1);
                    rooms[row][col] = distance;

                    explore(row+1, col, rooms, visited, queue);
                    explore(row-1, col, rooms, visited, queue);
                    explore(row, col+1, rooms, visited, queue);
                    explore(row, col-1, rooms, visited, queue);
                }

                distance++;

            }
        }

        public static void explore(int i, int j, int[][] rooms, Set<List<Integer>> visited, Queue<List<Integer>> queue ){
            if( i< 0 || i >= rooms.length || j<0 || j>= rooms[0].length
                    || visited.contains(Arrays.asList(i,j)) || rooms[i][j] == -1 ){
                return;
            }
            visited.add(Arrays.asList(i,j));
            queue.add(Arrays.asList(i,j));

        }

}
