package com.data.neetcode150.graph;

import java.util.*;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        System.out.println(pacificAtlantic(heights));

    }

    private static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer[], Boolean> pacific = new HashMap();
        Map<Integer[], Boolean> atlantic = new HashMap();

        int i = 0;
        int j = 0;
        explore(i, j, result, heights, atlantic, pacific);

        return result;
    }

    private static void explore(int i, int j, List<List<Integer>> result, int[][] heights, Map<Integer[],
            Boolean> atlantic, Map<Integer[], Boolean> pacific) {
        Integer[] toVisit = {i, j};

        while (i >= 0 && i < heights.length && j >= 0 && j < heights[0].length) {
            if (!atlantic.containsKey(toVisit)) {

            }
        }
            /*explore(i+1, j, result, heights, visited);
            explore(i-1, j, result, heights, visited);
            explore(i, j+1, result, heights, visited);
            explore(i, j-1, result, heights, visited);*/
    }


}
