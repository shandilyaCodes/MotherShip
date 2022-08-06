package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInUndirectedGraphBFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeCyclicNonDirectedGraph();
        //ArrayList<ArrayList<Integer>> adj = GraphMaker.makeAcyclicNonDirectedGraph();
        boolean result = isCyclic(adj, 11);
        if(result)
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }

    private static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] vis = new boolean[v+1];

        for(int i = 1; i <= v; i++) {
            if (!vis[i]) {
                if (hasCycleBfsUtil(adj, i, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasCycleBfsUtil(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(node, -1));
        vis[node] = true;

        while (!queue.isEmpty()) {
            Node polled = queue.poll();
            int cur = polled.node;
            int parent = polled.parent;

            for (Integer it : adj.get(cur)) {
                if (!vis[it]) {
                    queue.add(new Node(it, cur));
                    vis[it] = true;
                } else if (parent != it){
                    return true;
                }
            }
        }
        return false;
    }

    static class Node {
        int node;
        int parent;

        public Node(final int node, final int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
}
