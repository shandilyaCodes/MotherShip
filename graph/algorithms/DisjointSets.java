package graph.algorithms;

public class DisjointSets {

    private static final int[] rank = new int[11];
    private static final int[] parent = new int[11];

    public static void main(String[] args) {
        makeSet();
        union(1, 2);
        union(2, 3);
        union(4, 5);
        union(6, 7);
        union(5, 6);
        System.out.println(findParent(3) == findParent(7));
        union(3, 7);

        System.out.println(findParent(3) == findParent(7));
    }

    private static void makeSet() {
        for (int i = 1; i <= 10; i++) {
            rank[i] = 0;
            parent[i] = i;
        }
    }

    private static int findParent(final int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = findParent(parent[node]); // Path Compression
    }

    private static void union(int u, int v) {
        u = findParent(u);
        v = findParent(v);

        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[u] > rank[v]) {
            parent[v] = u;
        } else {
            parent[v] = u;
            rank[u]++;
        }
    }
}
