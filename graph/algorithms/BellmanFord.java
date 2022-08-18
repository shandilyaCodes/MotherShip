package graph.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {
    private static class Edge {
        private int from;
        private int to;
        private int weight;

        public Edge() {}

        public Edge(int from, int to, int weight) {
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

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> nonNegativeEdgeList = new ArrayList<>();

        nonNegativeEdgeList.add(new Edge(0, 1, 5));
        nonNegativeEdgeList.add(new Edge(1, 2, -2));
        nonNegativeEdgeList.add(new Edge(2, 4, 3));
        nonNegativeEdgeList.add(new Edge(3, 4, -2));
        nonNegativeEdgeList.add(new Edge(3, 2, 6));
        nonNegativeEdgeList.add(new Edge(5, 3, 1));
        nonNegativeEdgeList.add(new Edge(1, 5, -3));

        bellmanFord(0, 5, nonNegativeEdgeList);

        ArrayList<Edge> negativeWeightCycleEdgeList = new ArrayList<>();

        negativeWeightCycleEdgeList.add(new Edge(0, 1, 5));
        negativeWeightCycleEdgeList.add(new Edge(0, 2, 4));
        negativeWeightCycleEdgeList.add(new Edge(2, 3, 7));
        negativeWeightCycleEdgeList.add(new Edge(3, 1, -15));
        negativeWeightCycleEdgeList.add(new Edge(1, 2, 7));

        bellmanFord(0, 4, negativeWeightCycleEdgeList);
    }

    private static void bellmanFord(int source, int vertices, ArrayList<Edge> edges) {
        int[] distance = new int[vertices+1];
        Arrays.fill(distance, 10000);
        distance[source] = 0;

        while (vertices > 0) {
            vertices--;
            for (Edge edge : edges) {
                if (distance[edge.from] + edge.weight < distance[edge.to]) {
                    distance[edge.to] = distance[edge.from] + edge.weight;
                }
            }
        }

        boolean updated = false;

        for (Edge edge : edges) {
            if (distance[edge.from] + edge.weight < distance[edge.to]) {
                updated = true;
                System.out.println("Negative cycle detected");
                break;
            }
        }

        if (!updated) {
            Arrays.stream(distance).forEach(System.out::println);
        }
    }
}
