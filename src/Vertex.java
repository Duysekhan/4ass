import java.util.ArrayList;
import java.util.List;


public class Vertex<V> implements Comparable<Vertex<V>> {

    private final List<Edge<V>> edges = new ArrayList<>();
    private final V name;
    private float calculatedDistance;
    private boolean visited;

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public Vertex(V name) {
        this.name = name;
    }

    public List<Edge<V>> getEdges() {
        return edges;
    }

    public V getName() {
        return name;
    }

    public float getCalculatedDistance() {
        return calculatedDistance;
    }

    public void setCalculatedDistance(float calculatedDistance) {
        this.calculatedDistance = calculatedDistance;
    }

    public void link(Vertex otherVertex, float value) {
        Edge edge = new Edge(this, otherVertex, value);
        edges.add(edge);
        otherVertex.getEdges().add(edge);
    }

    @Override
    public String toString() {
        return name.toString();
    }

    @Override
    public int compareTo(Vertex v) {
        return Float.compare(calculatedDistance,v.getCalculatedDistance());
    }
}