package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteBfs {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> noCycleBip = GraphMaker.makeNoCycleBipartiteGraph(); // v : 5
        ArrayList<ArrayList<Integer>> nonOddBip = GraphMaker.makeNonOddLengthCycleBipartiteGraph(); // 10
        ArrayList<ArrayList<Integer>> nonBip = GraphMaker.makeOddLengthCycleNonBipartiteGraph(); // 8

        if (isBip(noCycleBip, 5)) {
            System.out.println("Graph is Bipartite");
        } else {
            System.out.println("Graph is non Bipartite");
        }

        if (isBip(nonOddBip, 10)) {
            System.out.println("Graph is Bipartite");
        } else {
            System.out.println("Graph is non Bipartite");
        }

        if (isBip(nonBip, 8)) {
            System.out.println("Graph is Bipartite");
        } else {
            System.out.println("Graph is non Bipartite");
        }
    }

    private static boolean isBip(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] color = new int[v+1];
        for (int i = 1; i <= v; i++) {
            color[i] = -1;
        }

        for (int i = 1; i <= v; i++) {
            if (color[i] == -1) {
                if (!bipBfs(adj, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean bipBfs(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;

        while (!q.isEmpty()) {
            Integer polled = q.poll();

            for (Integer it : adj.get(polled)) {
                if (color[it] == -1) {
                    color[it] = 1 - color[polled];
                    q.add(it);
                } else if (color[it] == color[polled]) {
                    return false;
                }
            }
        }
        return true;
    }
}
