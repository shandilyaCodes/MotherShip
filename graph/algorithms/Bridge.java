package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bridge {

    private static int time = 0;

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeBridgeGraph();
        findBridge(adj);
    }

    private static void findBridge(ArrayList<ArrayList<Integer>> adj) {
        int[] disc = new int[5];
        int[] low = new int[5];
        int[] parent = new int[5];

        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);
        Arrays.fill(parent, -1);

        List<Pair> bridges = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if (disc[i] == -1) {
                dfs(adj, i, disc, low, parent, bridges);
            }
        }

        bridges.forEach(System.out::println);
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj,
                            int node,
                            int[] disc,
                            int[] low,
                            int[] parent,
                            List<Pair> bridges) {
        disc[node] = low[node] = time;
        time++;

        for (Integer it : adj.get(node)) {
            if (disc[it] == -1) {
                parent[it] = node;
                dfs(adj, it, disc, low, parent, bridges);
                low[node] = Math.min(low[node], low[it]);

                if (low[it] > disc[node]) {
                    bridges.add(new Pair(node, it));
                }
            } else if (it != parent[node]) {
                low[node] = Math.min(disc[it], low[node]);
            }
        }
    }

    private static class Pair {
        final int from;
        final int to;

        public Pair(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    '}';
        }
    }
}
