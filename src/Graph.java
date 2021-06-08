import java.util.List;

public class Graph<V extends Comparable<V>> {

    private final List<Vertex<V>> vertices;

    public Graph(List<Vertex<V>> vertices) {
        this.vertices = vertices;
    }

    public List<Vertex<V>> getVertices() {
        return vertices;
    }
}