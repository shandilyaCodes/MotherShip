package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Kosaraju {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeSccGraph();
        findScc(adj);
    }

    private static void findScc(ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[7];
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            transpose.add(new ArrayList<>());
        }

        for (int i = 0; i < 7; i++) {
            if (!vis[i]) {
                dfsForward(i, stack, vis, adj);
            }
        }

        transpose(adj, transpose);

        Arrays.fill(vis, false);

        System.out.println("Strongly Connected components are as below");

        while (!stack.isEmpty()) {
            Integer top = stack.pop();
            if (!vis[top]) {
                dfsReverse(top, vis, transpose);
                System.out.println("");
            }
        }
    }

    private static void dfsForward(int node, Stack<Integer> stack, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfsForward(it, stack, vis, adj);
            }
        }
        stack.push(node);
    }

    private static void transpose(ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> transpose) {
        for (int i = 0; i < 7; i++) {
            for (Integer it : adj.get(i)) {
                transpose.get(it).add(i);
            }
        }
    }

    private static void dfsReverse(int node, boolean[] vis, ArrayList<ArrayList<Integer>> transpose) {
        System.out.print(node + " -- ");

        vis[node] = true;

        for (Integer it : transpose.get(node)) {
            if (!vis[it]) {
                dfsReverse(it, vis, transpose);
            }
        }
    }
}
