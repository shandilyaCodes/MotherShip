package graph.algorithms;

import graph.GraphMaker;
import graph.GraphNode;

import java.util.*;

public class Dijkstra {

    public static void main(String[] args) {
        ArrayList<ArrayList<GraphNode>> adj = GraphMaker.makeWeightedDAG(); // v : 6
        dijkstra(6, 0, adj);
    }

    private static void dijkstra(int v, int source, ArrayList<ArrayList<GraphNode>> adj) {
        int[] distance = new int[v];
        for (int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[source] = 0;

        Queue<GraphNode> queue = new PriorityQueue<>(v, Comparator.comparingInt(GraphNode::getWeight));
        queue.add(new GraphNode(source, 0));

        while (!queue.isEmpty()) {
            GraphNode node = queue.poll();

            for (GraphNode cur : adj.get(node.getNode())) {
                if (distance[cur.getNode()] > distance[node.getNode()] + cur.getWeight()) {
                    distance[cur.getNode()] = distance[node.getNode()] + cur.getWeight();
                    queue.add(new GraphNode(cur.getNode(), distance[cur.getNode()]));
                }
            }
        }
        Arrays.stream(distance).forEach(System.out::println);
    }
}
