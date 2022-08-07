package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortDFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeTopologicalDAG();

        makeTopo(adj, 6);
    }

    private static void makeTopo(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] vis = new int[v];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                dfsTopo(adj, i, vis, stack);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while(!stack.isEmpty()) {
            topo.add(stack.pop());
        }

        topo.forEach(System.out::println);
    }

    private static void dfsTopo(ArrayList<ArrayList<Integer>> adj, int node, int[] vis, Stack<Integer> stack) {
        vis[node] = 1;

        for (Integer it : adj.get(node)) {
            if (vis[it] == 0) {
                dfsTopo(adj, it, vis, stack);
            }
        }
        stack.push(node);
    }
}
