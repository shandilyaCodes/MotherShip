package graph.algorithms;

import graph.GraphMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceUndirectedGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = GraphMaker.makeUnitWeightGraph();
        findDistance(adj, 0, 9);
    }

    private static void findDistance(ArrayList<ArrayList<Integer>> adj, int source, int v) {
        int[] distanceArray = new int[v];
        for (int i = 0; i < v; i++) {
            distanceArray[i] = Integer.MAX_VALUE;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        distanceArray[0] = source;

        while (!q.isEmpty()) {
            Integer polled = q.poll();

            for (Integer it : adj.get(polled)) {
                if (distanceArray[it] > distanceArray[polled] + 1) {
                    distanceArray[it] = distanceArray[polled] + 1;
                    q.add(it);
                }
            }
        }

        Arrays.stream(distanceArray).forEach(System.out::println);
    }
}
