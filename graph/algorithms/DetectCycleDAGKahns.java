package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDAGKahns {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeAcyclicDAG(); // v : 2
        ArrayList<ArrayList<Integer>> adjO = GraphMaker.makeCyclicDAG(); // v : 9

        if (hasCycle(adj, 2)) {
            System.out.println("Cycle");
        } else {
            System.out.println("No Cycle");
        }

        if (hasCycle(adjO, 9)) {
            System.out.println("Cycle");
        } else {
            System.out.println("No Cycle");
        }
    }

    private static boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] indegree = new int[v+1];

        // Populate the indegree of the graph
        for (int i = 0; i <= v; i++) {
            for (Integer it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= v; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;
        while (!q.isEmpty()) {
            Integer polled = q.poll();
            count++;

            for (Integer it : adj.get(polled)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return count != v;
    }
}
