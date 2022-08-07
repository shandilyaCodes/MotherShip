package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoSortKahn {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeTopologicalDAG();
        findTopo(adj, 6);
    }

    private static void findTopo(ArrayList<ArrayList<Integer>> adj, int v) {
        List<Integer> topo = new ArrayList<>();
        int[] indegree = new int[v];

        for (int i = 0; i < v; i++) {
            for (Integer it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            Integer poll = q.poll();
            topo.add(poll);

            for (Integer it : adj.get(poll)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        topo.forEach(System.out::println);
    }
}
