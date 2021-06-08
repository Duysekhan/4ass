import java.util.*;

public class DijkstraAlgorithm<V extends Comparable<V>> {

    public Optional<Float> calculate(Graph<V> graph, Vertex<V> from, Vertex<V> to) {

        Set<Vertex<V>> vertices = new HashSet<>(graph.getVertices());

        vertices.stream().filter(v -> v != from).forEach(v -> v.setCalculatedDistance(Float.MAX_VALUE));
        from.setCalculatedDistance(0);

        Queue<Vertex<V>> queue = new PriorityQueue<>(vertices);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.remove();
            for (Edge<V> e : current.getEdges()) {

                Vertex<V> next = e.otherVertex(current);

                float distance = current.getCalculatedDistance() + e.getLength();
                if (distance < next.getCalculatedDistance()) {
                    next.setCalculatedDistance(distance);
                    queue.remove(next);
                    queue.add(next);
                }
            }

        }

        if (to.getCalculatedDistance() == Float.MAX_VALUE) {
            return Optional.empty();
        } else {
            return Optional.of(to.getCalculatedDistance());
        }
    }
}
