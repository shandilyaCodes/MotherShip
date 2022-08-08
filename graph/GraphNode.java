package graph;

public class GraphNode {
    private final int node;
    private final int weight;

    public GraphNode(final int node, final int weight) {
        this.node = node;
        this.weight = weight;
    }

    public int getNode() {
        return node;
    }

    public int getWeight() {
        return weight;
    }
}
