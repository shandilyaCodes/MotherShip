package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.Arrays;

public class ArticulationPoint {
    private static int time = 0;

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeAPGraph();
        findAP(adj);
    }

    private static void findAP(ArrayList<ArrayList<Integer>> adj) {
        int[] low = new int[6];
        int[] disc = new int[6];
        int[] parent = new int[6];

        Arrays.fill(low, -1);
        Arrays.fill(disc, -1);
        Arrays.fill(parent, -1);

        boolean[] articulationPoint = new boolean[6];

        for (int i = 0; i < 6; i++) {
            if (disc[i] == -1) {
                dfs(i, adj, low, disc, parent, articulationPoint);
            }
        }

        for (int i = 0; i < 6; i++) {
            if (articulationPoint[i])
                System.out.println(i);
        }
    }

    private static void dfs(int node,
                            ArrayList<ArrayList<Integer>> adj,
                            int[] low,
                            int[] disc,
                            int[] parent,
                            boolean[] aps) {
        disc[node] = low[node] = time;
        time++;
        int children = 0;

        for (Integer it : adj.get(node)) {
            if (disc[it] == -1) {
                children++;
                parent[it] = node;
                dfs(it, adj, low, disc, parent, aps);
                low[node] = Math.min(low[node], low[it]);

                if (parent[node] == -1 && children > 1) {
                    aps[node] = true;
                }

                if (parent[node] != -1 && low[it] >= disc[node]) {
                    aps[node] = true;
                }
            } else if (it != parent[node]) {
                low[node] = Math.min(low[node], disc[it]);
            }
        }
    }
}
