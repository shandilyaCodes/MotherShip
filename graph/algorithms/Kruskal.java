package graph.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kruskal {

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Node> adj = new ArrayList<>();

        // from, to, weight
        adj.add(new Node(0, 1, 2));
        adj.add(new Node(0, 3, 6));
        adj.add(new Node(1, 3, 8));
        adj.add(new Node(1, 2, 3));
        adj.add(new Node(1, 4, 5));
        adj.add(new Node(2, 4, 7));

        kruskal(adj, n);
    }

    private static class Node {
        private int from;
        private int to;
        private int weight;

        public Node(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        public int getWeight() {
            return weight;
        }
    }

    private static int findParent(final int u, final int[] parent) {
        if (u == parent[u])
            return u;
        return parent[u] = findParent(parent[u], parent);
    }

    private static void union(int u, int v, int[] parent, int[] rank) {
        u = findParent(u, parent);
        v = findParent(v, parent);

        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[v] < rank[u]) {
            parent[v] = u;
        } else {
            parent[v] = u;
            rank[u]++;
        }
    }

    private static void kruskal(ArrayList<Node> adj, int v) {
        adj.sort(Comparator.comparingInt(Node::getWeight));
        int[] parent = new int[v];
        int[] rank = new int[v];

        for (int i = 0; i < v; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int costOfMst = 0;

        List<Node> mst = new ArrayList<>();

        for (Node it : adj) {
            if (findParent(it.getFrom(), parent) != findParent(it.getTo(), parent)) {
                costOfMst += it.getWeight();
                mst.add(it);
                union(it.getFrom(), it.getTo(), parent, rank);
            }
        }
        System.out.println("MST Cost : " + costOfMst);
        for (Node it : mst) {
            System.out.println(it.getFrom() + " -- " + it.getTo());
        }
    }
}
