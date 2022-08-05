package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTraversal {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeBfsTraversalPracticeGraph();
        doBfs(adj, 7);
    }

    private static void doBfs(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] vis = new boolean[v+1];
        List<Integer> bfs = new ArrayList<>();

        for (int i = 1; i <= v; i++) {
            if (!vis[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    Integer polled = q.poll();
                    bfs.add(polled);

                    for (Integer it : adj.get(polled)) {
                        if (!vis[it]) {
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        bfs.forEach(System.out::println);
    }
}
