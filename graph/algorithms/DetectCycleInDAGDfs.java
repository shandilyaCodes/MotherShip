package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;

public class DetectCycleInDAGDfs {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeCyclicDAG(); // v : 9
        ArrayList<ArrayList<Integer>> adjO = GraphMaker.makeAcyclicDAG();

        if (isCyclic(adj, 9)) {
            System.out.println("Cyclic");
        } else {
            System.out.println("Acyclic");
        }

        if (isCyclic(adjO, 2)) {
            System.out.println("Cyclic");
        } else {
            System.out.println("Acyclic");
        }
    }

    private static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] vis = new int[v+1];
        int[] dfsVis = new int[v+1];

        for (int i = 1; i <= v; i++) {
            if (vis[i] == 0) {
                if (checkDfs(adj, vis, dfsVis, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDfs(ArrayList<ArrayList<Integer>> adj, int[] vis, int[] dfsVis, int node) {
        vis[node] = 1;
        dfsVis[node] = 1;

        for (Integer it : adj.get(node)) {
            if (vis[it] == 0) {
                if (checkDfs(adj, vis, dfsVis, it)) {
                    return true;
                }
            } else if (dfsVis[it] == 1) {
                return true;
            }
        }
        dfsVis[node] = 0;
        return false;
    }
}
