package graph.algorithms;

import graph.GraphMaker;
import graph.GraphNode;

import java.util.*;

public class Prims {
    public static void main(String[] args) {
        ArrayList<ArrayList<GraphNode>> adj = GraphMaker.makePrimsGraph();
        primsNonOptimised(adj, 5);
        primsOptimised(adj, 5);
    }

    private static void primsNonOptimised(ArrayList<ArrayList<GraphNode>> adj, int v) {
        int[] minimalPathArray = new int[v];
        int[] parent = new int[v];
        boolean[] presentInMst = new boolean[v];

        for (int i = 0; i < v; i++) {
            minimalPathArray[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        minimalPathArray[0] = 0;

        for (int i = 0; i < v-1; i++) {
            int min = Integer.MAX_VALUE;
            int foundMinimalAt = 0;

            for (int j = 0; j < v; j++) {
                if (!presentInMst[j] && minimalPathArray[j] < min) {
                    min = minimalPathArray[j];
                    foundMinimalAt = j;
                }
            }
            presentInMst[foundMinimalAt] = true;

            for (GraphNode node : adj.get(foundMinimalAt)) {
                if (!presentInMst[node.getNode()] && node.getWeight() < minimalPathArray[node.getNode()]) {
                    parent[node.getNode()] = foundMinimalAt;
                    minimalPathArray[node.getNode()] = node.getWeight();
                }
            }
        }
        for (int i = 1; i < v; i++) {
            System.out.println(parent[i] + " -- " + i);
        }
    }

    private static void primsOptimised(ArrayList<ArrayList<GraphNode>> adj, int v) {
        int[] minimalPathArray = new int[v];
        int[] parent = new int[v];
        boolean[] presentInMst = new boolean[v];

        for (int i = 0; i < v; i++) {
            minimalPathArray[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        minimalPathArray[0] = 0;

        Queue<GraphNode> queue = new PriorityQueue<>(v, Comparator.comparingInt(GraphNode::getWeight));
        queue.add(new GraphNode(0, minimalPathArray[0]));

        int foundMinimalAt = -1;
        for (int i = 0; i < v-1; i++) {
            foundMinimalAt = Objects.requireNonNull(queue.poll()).getNode();
            presentInMst[foundMinimalAt] = true;

            for (GraphNode node : adj.get(foundMinimalAt)) {
                if (!presentInMst[node.getNode()] && minimalPathArray[node.getNode()] > node.getWeight()) {
                    parent[node.getNode()] = foundMinimalAt;
                    minimalPathArray[node.getNode()] = node.getWeight();
                    queue.add(new GraphNode(node.getNode(), minimalPathArray[node.getNode()]));
                }
            }
        }

        for (int i = 1; i < v; i++) {
            System.out.println(parent[i] + "--" + i);
        }
    }
}
