package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TarjanAlgorithm {

    private static Integer TIME = 0;

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeSccGraph();
        findScc(adj);
    }

    private static void findScc(ArrayList<ArrayList<Integer>> adj) {
        int[] disc = new int[7];
        int[] low = new int[7];
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);
        boolean[] presentInStack = new boolean[7];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 7; i++) {
            if (disc[i] == -1) {
                dfs(adj, i, disc, low, stack, presentInStack);
            }
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj,
                            int node,
                            int[] disc,
                            int[] low,
                            Stack<Integer> stack,
                            boolean[] presentInStack) {
        disc[node] = low[node] = TIME;
        TIME++;

        stack.push(node);
        presentInStack[node] = true;

        for (Integer it : adj.get(node)) {
            if (disc[it] == -1) {
                dfs(adj, it, disc, low, stack, presentInStack);
                low[node] = Math.min(low[node], low[it]);
            } else if (presentInStack[it]) {
                low[node] = Math.min(low[node], disc[it]);
            }
        }

        if (low[node] == disc[node]) {
            System.out.println("SCC is : ");
            while (stack.peek() != node) {
                Integer top = stack.pop();
                System.out.println(top);
                presentInStack[top] = false;
            }
            Integer top = stack.pop();
            System.out.println(top);
            presentInStack[top] = false;
            System.out.println();
        }
    }
}
