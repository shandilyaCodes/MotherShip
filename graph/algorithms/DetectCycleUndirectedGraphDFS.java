package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;

public class DetectCycleUndirectedGraphDFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeCyclicNonDirectedGraph();
        //ArrayList<ArrayList<Integer>> adj = GraphMaker.makeAcyclicNonDirectedGraph();
        if(hasCycle(adj, 11))
            System.out.println("Graph has cycle");
        else
            System.out.println("Graph doesn't have cycle");
    }

    private static boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] vis = new boolean[v+1];
        for (int i = 1; i <= v; i++) {
            if(!vis[i]) {
                if(detectCycleDfs(adj, v, vis, -1))
                    return true;
            }
        }
        return false;
    }

    private static boolean detectCycleDfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis, int parent) {
        vis[node] = true;

        for (Integer it : adj.get(node)) {
            if(!vis[it]) {
                if (detectCycleDfs(adj, it, vis, node)) {
                    return true;
                }
            } else if(parent != it) {
                return true;
            }
        }
        return false;
    }
}
