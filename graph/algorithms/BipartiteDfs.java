package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;

public class BipartiteDfs {
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
                if (dfsBip(adj, v, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean dfsBip(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
        if (color[node] == -1) {
            color[node] = 1;
        }

        for (Integer it : adj.get(node)) {
            if (color[it] == -1) {
                color[it] = 1 - color[node];
                if (dfsBip(adj, it, color)) {
                    return true;
                }
            } else if (color[it] == color[node]){
                return true;
            }
        }
        return false;
    }
}
