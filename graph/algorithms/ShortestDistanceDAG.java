package graph.algorithms;

import graph.GraphMaker;
import graph.GraphNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestDistanceDAG {

    public static void main(String[] args) {
        ArrayList<ArrayList<GraphNode>> adj = GraphMaker.makeWeightedDAG();

        // Adjacency list, Source Node, No of Nodes
        findDistance(adj, 0, 6);
    }

    private static void findDistance(ArrayList<ArrayList<GraphNode>> adj, int source, int v) {
        // Find topo sort
        boolean[] vis = new boolean[v+1];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                doTopo(adj, stack, vis, i);
            }
        }

        // Now the stack will contain the topo sort for the given graph
        int[] distanceArray = new int[v];
        for (int i = 0; i < v; i++) {
            distanceArray[i] = Integer.MAX_VALUE;
        }
        distanceArray[source] = 0;

        while (!stack.isEmpty()) {
            Integer popped = stack.pop();

            for (GraphNode it : adj.get(popped)) {
                if(distanceArray[it.getNode()] > distanceArray[popped] + it.getWeight())
                    distanceArray[it.getNode()] = distanceArray[popped] + it.getWeight();
            }
        }
        Arrays.stream(distanceArray).forEach(System.out::println);
    }

    private static void doTopo(ArrayList<ArrayList<GraphNode>> adj, Stack<Integer> stack, boolean[] vis, int node) {
        vis[node] = true;
        for (GraphNode it : adj.get(node)) {
            if (!vis[it.getNode()]) {
                doTopo(adj, stack, vis, it.getNode());
            }
        }
        stack.push(node);
    }
}
