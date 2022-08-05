package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.List;

public class DfsTraversal {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeDfsTraversalPracticeGraph();
        doDfs(adj, 7);
    }

    private static void doDfs(ArrayList<ArrayList<Integer>> adj, int v) {
        List<Integer> storeDfs = new ArrayList<>();
        boolean[] vis = new boolean[v+1];

        for(int i = 1; i <= v; i++) {
            if(!vis[i]) {
                dfsUtil(adj, i, storeDfs, vis);
            }
        }

        storeDfs.forEach(System.out::println);
    }

    private static void dfsUtil(ArrayList<ArrayList<Integer>> adj, int node, List<Integer> storeDfs, boolean[] vis) {
        storeDfs.add(node);
        vis[node] = true;

        for (Integer it : adj.get(node)) {
            if(!vis[it]) {
                dfsUtil(adj, it, storeDfs, vis);
            }
        }
    }
}
